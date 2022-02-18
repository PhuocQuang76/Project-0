package com.revature.models;

import com.revature.helpers.*;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Director extends Personnel {
    private DirectorTittle tittle;
    private Department department;
    private President president;

    public Director(){};

    public Director(int id, int positionId, int ssn,String firstName, String lastName, Address addresses,
                   String gender, Date dob, String email, String phoneNumber, WorkPlace workPlace,
                   Date startDate, Date endDate, Status status) {
        super(id,positionId, ssn,firstName,lastName,addresses,gender,dob,email,phoneNumber,workPlace,startDate,endDate,status);
        //addresses = new HashMap();

    }

    public DirectorTittle getTittle() {
        return tittle;
    }

    public void setTittle(DirectorTittle tittle) {
        this.tittle = tittle;
    }


}
