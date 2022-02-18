package com.revature.dto;

import com.revature.helpers.Address;
import com.revature.models.Employee;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

    private Integer teamId;
    private Employee employee;
    private Address address;

    public Integer getTeamId() {
        return teamId;
    }

    public Employee getEmployee() {
        return employee;
    }
    public Address getAddress(){
        return address;
    }
}
