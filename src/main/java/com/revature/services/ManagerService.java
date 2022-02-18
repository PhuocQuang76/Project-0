package com.revature.services;

import com.revature.daos.ManagerDao;
import com.revature.daos.ManagerDaoImpl;
import com.revature.models.Manager;
import org.checkerframework.checker.units.qual.A;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerService {
    ManagerDao managerDao = new ManagerDaoImpl();

    public List<String> getAllManager() throws Exception{
        //Call manager persistence here.
        return managerDao.getAllManager();

    }

    public List<String> getManagerSalary(){
        return managerDao.getManagerSalary();
    }

}


