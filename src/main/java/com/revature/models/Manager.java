package com.revature.models;

import com.revature.helpers.*;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Manager extends Personnel {
    private ManagerTittle tittle;
    private Director director;
    private Set<Team> team;

    public Manager(){}

    public Manager(int id, int positionId, int ssn, String firstName, String lastName, Address addresses,
                    String gender, Date dob, String email, String phoneNumber, WorkPlace workPlace,
                    Date startDate, Date endDate, Status status) {
        super(id,positionId, ssn,firstName,lastName,addresses,gender,dob,email,phoneNumber,workPlace,startDate,endDate,status);
        //addresses = new HashMap();

    }


    public Set<Team> getTeam() {
        return team;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }

    public ManagerTittle getTittle() {
        return tittle;
    }

    public void setTittle(ManagerTittle tittle) {
        this.tittle = tittle;
    }
}
