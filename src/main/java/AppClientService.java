import java.sql.SQLException;
import java.util.List;

public class AppClientService {
    public static void main(String[] args) throws SQLException {
        Database database = Database.getInstance();
        ClientService clientService = new ClientService(database);
        ClientDAO clientOleksiy = new ClientDAO("10", "Oleksiy");

        clientService.create(clientOleksiy);
        System.out.println(clientService.getById("5"));

        ClientDAO clientVladimir = new ClientDAO("5", "Vladimir");
        clientService.setName(clientVladimir);
        System.out.println(clientService.getById("5"));

        clientService.deleteById("5");
        List<ClientDAO> clientDAOList = clientService.listAll();
        for (ClientDAO client:clientDAOList) {
            System.out.println("client = " + client);
        }

        clientService.deleteAll();
        List<ClientDAO> clientDAOLists = clientService.listAll();
        if(clientDAOLists.isEmpty()){
            System.out.println("Список клиентов пустой!");
        }
    }
}
