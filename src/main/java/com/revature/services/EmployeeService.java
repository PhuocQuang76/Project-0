package com.revature.services;
import com.revature.daos.EmployeeDao;
import com.revature.daos.EmployeeDaoImpl;
import com.revature.helpers.Address;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.models.Employee;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    EmployeeDao employeeDao = new EmployeeDaoImpl();
    //Methods
    private TeamService teamService;

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }

    //Create new employee
    public boolean createNewEmployee(int teamId, Employee employee, Address address) {
        //Call employee persistence here.
        try {
            return employeeDao.createNewEmployee(teamId,employee,address);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Update current employee info
    public boolean updateEmployee(int id,int positionId, WorkPlace workPlace, Date endDate, Status status, String passWord){
        try{
            return employeeDao.updateEmployee(id,positionId,workPlace,endDate,status,passWord);
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //Get all active employee
    public List<Employee> getAllActiveEmployee() throws SQLException {
        return employeeDao.getAllEmployee();
    }

    public List<String> getViewSalary(int id){
        return employeeDao.getViewEmployeeSalary(id);
    }

    public boolean updateEmployeeTypeSalary(int id, int min_salary, int max_salary){
        return employeeDao.updateEmployeeSalary(id,min_salary,max_salary);
    }

    public String getByUsernameAndPassword(String email, String pass) throws Exception {
        return employeeDao.getEmployeeByUsernameAndPassword(email,pass);
    }

}
