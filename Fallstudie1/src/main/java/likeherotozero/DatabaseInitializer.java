package likeherotozero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class DatabaseInitializer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/co2werte";
        String user = "root"; // Dein MySQL-Benutzername
        String password = ""; // Dein MySQL-Passwort

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = Files.lines(Paths.get("import.sql"))
                             .collect(Collectors.joining(" "));

            stmt.execute(sql);
            System.out.println("Daten erfolgreich importiert.");

        } catch (SQLException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
