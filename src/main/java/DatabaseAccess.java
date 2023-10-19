import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseAccess {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "password");
            System.out.println("Verbindung zur H2-Datenbank hergestellt");

            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS your_table (id INT PRIMARY KEY, name VARCHAR(255))";
            statement.execute(createTableSQL);

            String insertDataSQL = "INSERT INTO your_table (id, name) VALUES (1, 'John')";
            statement.execute(insertDataSQL);

            // Weitere Abfragen ausführen


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
