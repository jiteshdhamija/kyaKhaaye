package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.kyaKhaaye.Models.AllFields;

public class getAll {
    public static AllFields getAllFields() throws SQLException, ClassNotFoundException {
        AllFields a = new AllFields();
        repo r = new repo();
        Connection c = r.connect();
        Statement s = c.createStatement();
        a = (AllFields) s.executeQuery("select * from food;");
        return a;
    }
}
