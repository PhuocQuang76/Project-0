package com.revature.Controllers;
import com.revature.dto.EmployeeDTO;
import com.revature.dto.EmployeeUpdateDTO;
import com.revature.dto.PositionDTO;
import io.javalin.http.Context;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

public class EmployeeController {
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private final EmployeeService employeeService = new EmployeeService();

    public void handleCreateNewEmployee(Context ctx){
        EmployeeDTO employee = ctx.bodyAsClass(EmployeeDTO.class);
        boolean success = employeeService.createNewEmployee( employee.getTeamId(),employee.getEmployee(),employee.getAddress());
        // prepare response
        if(success){
            ctx.status(201);
            ctx.result("Success");
        } else {
            ctx.status(400);
            ctx.result("Failed");
        }
    }
    public void handleViewEmployeeSalaryRange(Context ctx){
        String idParam = ctx.pathParam("id");
        int id = Integer.parseInt(idParam);
        List<String> employeeSalary = employeeService.getViewSalary(id);
        ctx.json(employeeSalary);
    }

    public void handleUpdateEmployee(Context ctx){
        // interpret incoming request
        String idParam = ctx.pathParam("id");
        EmployeeUpdateDTO employeeToUpdate = ctx.bodyAsClass(EmployeeUpdateDTO.class);
        int idToUpdate = Integer.parseInt(idParam);
        employeeToUpdate.setId(idToUpdate);
        java.sql.Date.valueOf(simpleDateFormat.format(employeeToUpdate.getEndDate()));
        //fulfill the request
        boolean success = employeeService.updateEmployee(employeeToUpdate.getId(),employeeToUpdate.getPositionId(),employeeToUpdate.getWorkPlace(),
                java.sql.Date.valueOf(simpleDateFormat.format(employeeToUpdate.getEndDate())),
                employeeToUpdate.getStatus(),employeeToUpdate.getPassWord());
        if(success){
            ctx.status(200);
            ctx.result("Success");
        }else{
            ctx.status(400);
            ctx.result("Failed");
        }
    }

    public void handleGetAllActiveEmployee(Context ctx) throws SQLException {
        List<Employee> employee = employeeService.getAllActiveEmployee();
        ctx.json(employee);
    }

    public void handleUpdateEmployeeSalary(Context ctx){
        String idParam = ctx.pathParam("id");
        PositionDTO positionDTO = ctx.bodyAsClass(PositionDTO.class);
        int idToUpdate = Integer.parseInt(idParam);
        positionDTO.setId(idToUpdate);

        //fulfill the request
        boolean success = employeeService.updateEmployeeTypeSalary(positionDTO.getId(),positionDTO.getMin_salary(),positionDTO.getMax_salary());
        if(success){
            ctx.status(200);
            ctx.result("Success");
        }else{
            ctx.status(400);
            ctx.result("Failed");
        }
    }
}
