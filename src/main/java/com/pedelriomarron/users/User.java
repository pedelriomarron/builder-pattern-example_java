package com.pedelriomarron.users;

public class User {

    private String email;
    private String name;
    private String lastName;
    private String address;
    private String phone;


    protected User(){}

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {this.email = email;}
    public void setName(String name) {this.name = name;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone) {this.phone = phone;}


}
