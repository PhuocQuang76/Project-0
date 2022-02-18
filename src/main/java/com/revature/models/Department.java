package com.revature.models;

import com.revature.helpers.Address;

public abstract class Department {
    private String departmentName;
    private Address departmentAddress;

    Department(String departmentName, Address departmentAddress){
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Address getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(Address departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
}

/*

sale and marketting
finance
Executive Management
Legal
Software Engineering
IT
Human Resource
 */