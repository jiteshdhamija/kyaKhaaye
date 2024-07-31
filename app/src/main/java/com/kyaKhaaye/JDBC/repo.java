package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class repo {
    public Connection c;

    public Connection connect() throws SQLException, ClassNotFoundException {
        // Register the JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Specify the connection URL, username, and password
        String url = "jdbc:postgresql://localhost:5434/food";
        String username = "postgres";
        String password = "jdcp3740;;@;;";

        // Create the connection
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

}
