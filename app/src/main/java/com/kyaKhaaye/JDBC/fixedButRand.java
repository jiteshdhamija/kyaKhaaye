package com.kyaKhaaye.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kyaKhaaye.Models.AllFields;
import com.kyaKhaaye.Resources.Constants;

public class fixedButRand {

    public static AllFields fixedButRandom(AllFields a) throws ClassNotFoundException, SQLException {
        repo r = new repo();
        Connection c = r.connect();
        String str = createStatement(a);
        List<AllFields> list = getArrResultFromDB(c, str);
        List<Integer> idList = getIdList(list);
        if (idList.size() == 0) {
            return new AllFields();
        }
        Random generator = new Random();
        int number = generator.nextInt(idList.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == idList.get(number))
                return list.get(i);
        }
        return new AllFields();
    }

    private static List<Integer> getIdList(List<AllFields> list) throws SQLException {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).getId());
        }
        return result;
    }

    private static List<AllFields> getArrResultFromDB(Connection c, String str) throws SQLException {
        PreparedStatement ps = c.prepareStatement(str);
        ResultSet rs = ps.executeQuery();
        List<AllFields> listAll = new ArrayList<AllFields>();
        while (rs.next()) {
            AllFields temp = new AllFields();
            temp.id = rs.getInt(1);
            temp.dish = rs.getString(2);
            temp.cuisine = rs.getString(3);
            temp.beverage = rs.getBoolean(4);
            temp.hot = rs.getBoolean(5);
            temp.veg = rs.getBoolean(6);
            temp.course = rs.getString(7);
            temp.region = rs.getString(8);
            listAll.add(temp);
        }
        return listAll;
    }

    private static String createStatement(AllFields a) {
        String str = Constants.SE_STRING;
        int counter = 0;
        if (a.cuisine != "random") {
            str = str.concat(Constants.CU_STRING)
                    .concat(Constants.QO_STRING + a.cuisine + Constants.QO_STRING);
        } else {
            counter++;
        }
        if (a.beverage != false) {
            str = counter == 1 ? str : str.concat(Constants.AND_STRING);
            str = str.concat(Constants.BE_STRING)
                    .concat(String.valueOf(a.beverage));
        } else {
            counter++;
        }
        if (a.hot != false) {
            str = counter == 2 ? str : str.concat(Constants.AND_STRING);
            str = str.concat(Constants.HO_STRING)
                    .concat(String.valueOf(a.hot));
        } else {
            counter++;
        }
        if (a.veg != false) {
            str = counter == 3 ? str : str.concat(Constants.AND_STRING);
            str = str.concat(Constants.VE_STRING)
                    .concat(String.valueOf(a.veg));
        } else {
            counter++;
        }
        if (a.course != "random") {
            str = counter == 4 ? str : str.concat(Constants.AND_STRING);
            str = str.concat(Constants.CO_STRING)
                    .concat(Constants.QO_STRING + a.course + Constants.QO_STRING);
        } else {
            counter++;
        }
        if (a.region != "random") {
            str = counter == 5 ? str : str.concat(Constants.AND_STRING);
            str = str.concat(Constants.RE_STRING)
                    .concat(Constants.QO_STRING + a.region + Constants.QO_STRING);
        } else {
            counter++;
        }
        return str;
    }

}