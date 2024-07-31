package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.kyaKhaaye.Resources.queries;

/*create TABLE food ( id integer, 
dish varchar(255),
cuisine varchar(255), 
beverage boolean, 
veg boolean,
course varchar(255),
hot boolean,
region varchar(255)); 
(dish,cuisine,beverage,veg,course,hot,region)*/

public class add {
    public static void addToDb(String[] queries) throws SQLException, ClassNotFoundException {
        repo r = new repo();
        Connection c = r.connect();
        Statement st = c.createStatement();
        for (int i = 0; i < queries.length; i++) {
            st.executeQuery(queries[i]);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        addToDb(queries.queries);
    }
}
