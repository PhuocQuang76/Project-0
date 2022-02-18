package com.revature.daos;

import com.revature.helpers.DB.ConnectionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao{

    public List<String> getAllDirector(){
        String sql = "select id, firstname, lastname \n" +
                "from employee \n" +
                "where\n" +
                "employee.position_id IN(select id\n" +
                "from position\n" +
                "where position_type = ?);";
        List<String> directorList = new ArrayList<>();

        try(Connection con = ConnectionDb.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);){
            ps.setString(1,"DIR");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String result;
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                result = "id:" + id + "->  " + firstName + ' ' + lastName;
                directorList.add(result);

                //directorMap.get(manager.getFirstName());
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return directorList;
    }
}
