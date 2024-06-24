package connect;

import java.sql.Connection;
import java.sql.*;
import javax.sql.*;

public class DatabaseConnection {
    public static final String username = "root";
    public static final String password = "System";
    public static final String url = "jdbc:mysql://localhost:3306/Student";

    public static void getConnection() {
        Connection cn;
        try {
            // Step 2: Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish the connection
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful: " + cn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getConnection();
    }
}
