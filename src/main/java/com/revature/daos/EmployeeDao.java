package com.revature.daos;

import com.revature.helpers.Address;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.models.Employee;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface EmployeeDao {
    public boolean createNewEmployee(int teamId, Employee employee, Address address) throws SQLException;

    public boolean updateEmployee(int id, int positionId, WorkPlace workPlace, Date endDate, Status status, String passWord) throws SQLException;

    public List<Employee> getAllEmployee();

    public List<String> getViewEmployeeSalary(int id);

    public boolean updateEmployeeSalary(int id, int min_salary, int max_salary);

    public String getEmployeeByUsernameAndPassword(String email, String passWord) throws Exception;
}
