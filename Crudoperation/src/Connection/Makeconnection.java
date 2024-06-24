package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Makeconnection {
    public static final String username = "root";
    public static final String password = "System";
    public static final String url = "jdbc:mysql://localhost:3306/Student";

    public static Connection getConnection() {
        Connection cn = null;
        try {
            // Step 2: Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish the connection
            cn = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection successful: " + cn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return (cn);
    }
}
