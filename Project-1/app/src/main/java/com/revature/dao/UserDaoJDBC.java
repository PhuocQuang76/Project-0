package com.revature.dao;

import com.revature.controllers.AuthController;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDaoJDBC implements UserDao {
    ConnectionUtil connectionUtil = ConnectionUtil.getInstance();

    @Override
    public void createUser(User user){
        try{
            Connection con = connectionUtil.getConnection();
            String sql = "INSERT INTO ers_users VALUES('" + user.getEmail() + "','" +user.getFirstName() + "','" + user.getLastName() + "','" + user.getRole() + "','" + user.getPassWord() + "')";
            System.out.println(sql);

            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public User readUserByEmail(String email) {
        User user = null;
        try{
            Connection con = connectionUtil.getConnection();

            String sql = "SELECT * FROM ers_users WHERE email=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,email);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                user = new User(rs.getString(2),rs.getString(3),rs.getString(4),
                        Role.values()[rs.getInt(5)-1],rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return user;
    }

    @Override
    public User getUserById(int id){
//        AuthController authController;
//        authController.verify.

        return null;
    }
}
