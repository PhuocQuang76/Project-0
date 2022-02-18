package com.revature.helpers.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://35.236.54.72:5432/postgres";
        //set from Add Configurations
//        String userName = System.getenv("aileen");
//        String passWord = System.getenv("mysecretpassword");
        String userName = "postgres";
        String passWord = "aileen";
        try {
            return DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
