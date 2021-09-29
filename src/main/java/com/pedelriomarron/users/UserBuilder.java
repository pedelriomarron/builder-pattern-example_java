package com.pedelriomarron.users;

public class UserBuilder {

    private String email;
    private String name;
    private String lastName;
    private String address;
    private String phone;

    public UserBuilder(){}

    public UserBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder withName(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withPhone(String phone){
        this.phone = phone;
        return this;
    }

    public UserBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public User build(){
        User user = new User();

        if(this.email == null){
            throw new IllegalArgumentException("Email is required");
        }

        user.setEmail(this.email);
        user.setLastName(this.lastName);
        user.setName(this.name);
        user.setPhone(this.phone);
        user.setAddress(this.address);

        return user;
    }

}
