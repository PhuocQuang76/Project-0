package com.revature.services;

import com.revature.dao.ReimbursementDao;
import com.revature.dao.ReimbursementDaoJDBC;
import com.revature.models.Reimbursement;

public class ReimbursementService {
    ReimbursementDao reimbursementDao = new ReimbursementDaoJDBC();
    public Reimbursement createReimbursement(Reimbursement reimbursement){
        return reimbursementDao.createReimbursement();
    }
}
