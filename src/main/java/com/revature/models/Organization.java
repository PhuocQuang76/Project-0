package com.revature.models;

import com.revature.helpers.Address;

public class Organization {
    private String name;
    private Address corporateHeadquarter;
    private President president;

    public Organization(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getCorporateHeadquarter() {
        return corporateHeadquarter;
    }

    public void setCorporateHeadquarter(Address corporateHeadquarter) {
        this.corporateHeadquarter = corporateHeadquarter;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }
}
