package com.revature.dao;

import com.revature.models.Reimbursement;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class ReimbursementDaoJDBC implements ReimbursementDao{
    ConnectionUtil connectionUtil = ConnectionUtil.getInstance();
    @Override
    public Reimbursement createReimbursement(){

//        try{
//            Connection con = connectionUtil.getConnection();
//            String sql ="";
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
        return null;
    }
}
