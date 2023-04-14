import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private final Database dataBase;
    private final PreparedStatement selectStatement;
    private final PreparedStatement insertStatement;
    private final PreparedStatement updateStatement;
    private final PreparedStatement truncateStatement;
    private final PreparedStatement deleteByIdStatement;
    private final PreparedStatement selectAllStatement;

    public ClientService(Database dataBase) throws SQLException {
        this.dataBase = dataBase;
        Connection connection = dataBase.getConnection();

        this.selectStatement = connection
                .prepareStatement("select * from client where id = ? ");

        this.selectAllStatement = connection
                .prepareStatement("select * from client");

        this.insertStatement = connection
                .prepareStatement("insert into client (id, name) VALUES(?, ?)");

        this.updateStatement = connection
                .prepareStatement("update client set name = ? where id = ?;");


        this.truncateStatement = connection
                .prepareStatement("truncate table client");

        this.deleteByIdStatement = connection
                .prepareStatement("delete from client where id = ?");

    }

    public void create(ClientDAO clientDAO) {
        try {
            insertStatement.setString(1, clientDAO.getID());
            insertStatement.setString(2, clientDAO.getName());

            insertStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientDAO getById(String id) throws SQLException {
        selectStatement.setString(1, id);
        ResultSet resultSet = selectStatement.executeQuery();

        while (resultSet.next()) {
            String entityId = resultSet.getString("id");
            String name = resultSet.getString("name");

            return new ClientDAO(entityId, name);
        }

        resultSet.close();

        return null;
    }

    public void setName(ClientDAO clientDAO) {
        try {
            updateStatement.setString(1, clientDAO.getName());
            updateStatement.setString(2, clientDAO.getID());
            updateStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(String id) throws SQLException {
        try {
            deleteByIdStatement.setString(1, id);
            deleteByIdStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAll() throws SQLException {
        truncateStatement.executeUpdate();
    }

    public List<ClientDAO> listAll() throws SQLException {
        List<ClientDAO> result = new ArrayList<>();
        ResultSet resultSet = selectAllStatement.executeQuery();

        while (resultSet.next()) {
            String entityId = resultSet.getString("id");
            String name = resultSet.getString("name");

            result.add(new ClientDAO(entityId, name));
        }
        resultSet.close();

        return result;
    }

}
