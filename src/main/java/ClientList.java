import java.util.ArrayList;
import java.util.List;

public class ClientList {
    public static List<ClientDAO> clientDAOS = new ArrayList<>();

    public static List<ClientDAO> getInitClientDAO() {
        clientDAOS.add(new ClientDAO("1", "Ivanov"));
        clientDAOS.add(new ClientDAO("2", "Petrov"));
        clientDAOS.add(new ClientDAO("3", "Ivanenko"));
        clientDAOS.add(new ClientDAO("4", "Petrenko"));
        clientDAOS.add(new ClientDAO("5", "Vasylenko"));

        return clientDAOS;
    }
}
