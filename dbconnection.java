import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbconnection {
        private static final String url = "jdbc:mysql://localhost:3306/Pakistantourismsystem_user";
        private static final String user = "root";
        private static final String password = "AminaZahid12345";

        private static Connection connection = null;

        public static Connection getconnection() {
            try {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(url, user, password);
                    System.out.println("Connected successfully!");
                }
            } catch (SQLException e) {
                System.out.println("Connection failed!");
                e.printStackTrace();
            }
            return connection;
        }
}
