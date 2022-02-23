package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class ConnectionUtil {
    //This will be a singleton which creates our connection to the database for us
    private static ConnectionUtil connectionUtil;
    private EnvironmentParser environmentParser;

    private ConnectionUtil(){
        environmentParser = new EnvironmentParser();
    }

    private String database = "ReimbursementSystem";

    public static synchronized ConnectionUtil getInstance(){
        if(connectionUtil == null){
            return new ConnectionUtil();
        }
        return connectionUtil;
    }

    //Create a database connection based off of our credentials and url
    public Connection getConnection(){
        Connection con;

        Map<String, String> credentials = environmentParser.parseVariables();
        //String IP = credentials.get("URL");

        try{
            String dbUrl = "jdbc:postgresql://" + credentials.get("URL") + ":5432/" + database;
            con = DriverManager.getConnection(dbUrl, credentials.get("USERNAME"), credentials.get("PASSWORD"));
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
