package com.revature.daos;

import com.revature.models.Manager;

import java.util.List;

public interface ManagerDao {
    public List<String> getAllManager();

    public List<String> getManagerSalary();
}
