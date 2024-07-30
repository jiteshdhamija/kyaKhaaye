package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*create TABLE food ( id int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
dish varchar(255),
cuisine varchar(255), 
beverage boolean, 
veg boolean,
course varchar(255),
hot boolean,
region varchar(255)); 
(dish,cuisine,beverage,veg,course,hot,region)*/

public class add {
    public void addToDb(String query) throws SQLException, ClassNotFoundException {
        repo r = new repo();
        Connection c = r.connect();
        Statement st = c.createStatement();
        st.executeQuery(query);
    }
}
