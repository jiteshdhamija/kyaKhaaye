package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kyaKhaaye.Models.AllFields;

public class getAll {
    public static List<AllFields> getAllFields() throws SQLException, ClassNotFoundException {
        List<AllFields> a = new ArrayList<>();
        repo r = new repo();
        Connection c = r.connect();
        Statement s = c.createStatement();
        ResultSet set = s.executeQuery("select * from food;");
        while (set.next()) {
            AllFields b = new AllFields();
            b.id = set.getInt(1);
            // dish | cuisine | beverage | hot | veg | course | region
            b.dish = set.getString(2);
            b.cuisine = set.getString(3);
            b.beverage = set.getBoolean(4);
            b.hot = set.getBoolean(5);
            b.veg = set.getBoolean(6);
            b.course = set.getString(7);
            b.region = set.getString(8);
            a.add(b);
        }
        return a;
    }
}
