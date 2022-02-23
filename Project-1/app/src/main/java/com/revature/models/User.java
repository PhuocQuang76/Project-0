package com.revature.models;

public class User {
    private int userId;
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private String passWord;

    //Contructors
    public User(){};
    public User(String email,String firstName, String lastName, Role role, String passWord){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.passWord = passWord;
    }

    //Gets and sets


    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
