package com.revature.helpers;

public class Address{
    private int employeeId;
    private int streetNumber;
    private String streetName1;
    private String streetName2;
    private String city;
    private String state;
    private int postCode;

    public Address(){}

    public Address(int streetNumber, String streetName1,String streetName2,
                   String city, String state, int postCode){
//        this.employeeId = employeeId;
        this.streetNumber = streetNumber;
        this.streetName1 = streetName1;
        this.streetName2 = streetName2;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
    }

    //Getters and Setters
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName1() {
        return streetName1;
    }

    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    public String getStreetName2() {
        return streetName2;
    }

    public void setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

//    @Override
//    public String toString() {
//        return streetNumber + " " + streetName1 + streetName2 +  " " + city + " "
//                + state + " " + postcode;
//    }
}
