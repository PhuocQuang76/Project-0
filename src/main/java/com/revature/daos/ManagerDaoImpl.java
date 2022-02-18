package com.revature.daos;

import com.revature.helpers.DB.ConnectionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerDaoImpl implements ManagerDao{

    public List<String> getAllManager(){
        String sql =
        "select e.id, e.firstname , e.lastname, p.position_name\n" +
                "from employee e\n" +
                "join position p\n" +
                "on e.position_id  = p.id\n" +
                "where p.position_name  like 'man%'";
        List<String> managerList = new ArrayList<>();
        String result;
      try(Connection con = ConnectionDb.getConnection();
          Statement s = con.createStatement();){
          ResultSet rs = s.executeQuery(sql);

          while (rs.next()){

              int id = rs.getInt("id");
              String firstName = rs.getString("firstname");
              String lastName = rs.getString("lastname");
              String positionType = rs.getString("position_name");

              result = "id " + id + ": " + positionType + " -> " + firstName + " " + lastName;
              managerList.add(result);
          }

      }catch (SQLException e){
          e.printStackTrace();
      }

      return managerList;
    }

    @Override
    public List<String> getManagerSalary(){
        String sql =
                "select e.id, e.firstname , e.lastname, p.position_name, p.min_salary  , p.max_salary \n" +
                        "from employee e\n" +
                        "join position p\n" +
                        "on e.position_id  = p.id\n" +
                        "where p.position_name  like 'man%'";
        List<String> managerSalary = new ArrayList<>();
        String result;
        try(Connection con = ConnectionDb.getConnection();
            Statement s = con.createStatement();){
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()){

                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String positionType = rs.getString("position_name");
                int min_salary = rs.getInt("min_salary");
                int max_salary = rs.getInt("max_salary");

                result = "id " + id + ": " + firstName + " " + lastName + " (" +
                        positionType + ") ->  Salary from: $" + min_salary + " -> $" + max_salary;
                managerSalary.add(result);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return managerSalary;
    }
}
