package com.example.mysignupapp;

public class User {
    private String email;
    private String name;
    private String role;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
