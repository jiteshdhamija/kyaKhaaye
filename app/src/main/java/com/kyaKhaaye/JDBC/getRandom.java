package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.kyaKhaaye.Models.AllFields;

public class getRandom {
    public static AllFields getRand() throws ClassNotFoundException, SQLException {
        AllFields a = new AllFields();
        repo r = new repo();
        Connection c = r.connect();
        Random random = new Random();
        int rand = random.nextInt(458);
        PreparedStatement ps = c.prepareStatement("select * from food where id=?");
        ps.setInt(1, rand);
        AllFields result = getRs(a, ps);

        return result;
    }

    private static AllFields getRs(AllFields a, PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            a.id = rs.getInt(1);
            a.dish = rs.getString(2);
            a.cuisine = rs.getString(3);
            a.beverage = rs.getBoolean(4);
            a.hot = rs.getBoolean(5);
            a.veg = rs.getBoolean(6);
            a.course = rs.getString(7);
            a.region = rs.getString(8);
        }
        return a;
    }

}
