package com.cognizant.introtospringboot.user;

final class UserModel {
    private String name;
    private String email;
    private String phoneNumber;

    UserModel(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UserModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
