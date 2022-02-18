package com.revature.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.helpers.*;


import java.util.Date;
import java.util.Map;

@JsonIgnoreProperties
public class Employee extends Personnel {
    private EmployeeTittle tittle;
    private Team team;
    //Constructors
    public Employee(int id, int positionId, int ssn, String firstName, String lastName,Address addresses,
                    String gender, Date dob, String email, String phoneNumber, WorkPlace workPlace,
                    Date startDate, Date endDate, Status status, EmployeeTittle tittle) {
        super(id,positionId, ssn,firstName,lastName,addresses,gender,dob,email,phoneNumber,workPlace,startDate,endDate,status);
        //addresses = new HashMap();
        this.tittle = tittle;
    }
    public Employee(){}



    public EmployeeTittle getTittle() {
        return tittle;
    }
    public void setTittle(EmployeeTittle tittle) {
        this.tittle = tittle;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
