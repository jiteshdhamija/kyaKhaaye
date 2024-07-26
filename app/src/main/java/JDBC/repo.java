package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class repo {
    public Connection c;

    public Connection connect() {
        try { // Register the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Specify the connection URL, username, and password
            String url = "jdbc:sqlserver://sql12.freesqldatabse.com\\sql12722175:3306;databaseName=sql12722175";
            String username = "sql12722175";
            String password = "enEF67NhlF";

            // Create the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return c;
    }

}
