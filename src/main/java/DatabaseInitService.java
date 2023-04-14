import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException, SQLException {

        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:./myBase_Laba6", null, null)
                .load();

        flyway.migrate();

    }
}
