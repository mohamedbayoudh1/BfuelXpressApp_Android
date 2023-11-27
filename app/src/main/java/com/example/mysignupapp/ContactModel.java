package com.example.mysignupapp;



public class ContactModel {
    private String email;
    private String name;

    public ContactModel() {
        // Required empty public constructor for Firebase
    }

    public ContactModel(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

