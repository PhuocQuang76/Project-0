package com.revature.models;

import com.revature.helpers.Address;
import com.revature.helpers.AddressType;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class President extends Personnel {
    private Organization organization;

    public President(){}

    public President(int id,int positionId, int ssn, String firstName, String lastName, Address addresses,
                   String gender, Date dob, String email, String phoneNumber, WorkPlace workPlace,
                   Date startDate, Date endDate, Status status, Set<Director> director) {
        super(id,positionId, ssn,firstName,lastName,addresses,gender,dob,email,phoneNumber,workPlace,startDate,endDate,status);
        //addresses = new HashMap();

    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
