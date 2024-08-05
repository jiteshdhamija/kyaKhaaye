package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kyaKhaaye.Resources.queries;

public class getDistinct {
    public static List<String> getDistinctCuisine() throws ClassNotFoundException, SQLException {
        repo r = new repo();
        Connection c = r.connect();
        PreparedStatement ps = c.prepareStatement(queries.DIST_CUISINE_STRING);
        ResultSet rs = ps.executeQuery();
        List<String> result = new ArrayList<String>();
        while (rs.next()) {
            String s = rs.getString(1);
            result.add(s);
        }
        return result;
    }

    public static List<String> getDistinctCourse() throws ClassNotFoundException, SQLException {
        repo r = new repo();
        Connection c = r.connect();
        PreparedStatement ps = c.prepareStatement(queries.DIST_COURSE_STRING);
        ResultSet rs = ps.executeQuery();
        List<String> result = new ArrayList<String>();
        while (rs.next()) {
            String s = rs.getString(1);
            result.add(s);
        }
        return result;
    }

    public static List<String> getDistinctRegion() throws ClassNotFoundException, SQLException {
        repo r = new repo();
        Connection c = r.connect();
        PreparedStatement ps = c.prepareStatement(queries.DIST_REGION_STRING);
        ResultSet rs = ps.executeQuery();
        List<String> result = new ArrayList<String>();
        while (rs.next()) {
            String s = rs.getString(1);
            result.add(s);
        }
        return result;
    }
}
