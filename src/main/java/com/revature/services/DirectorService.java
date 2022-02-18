package com.revature.services;

import com.revature.daos.DirectorDao;
import com.revature.daos.DirectorDaoImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DirectorService {

    DirectorDao directorDao = new DirectorDaoImpl();

    public List<String> getAllDirector() throws SQLException {
        return directorDao.getAllDirector();
    };

}
