package com.example.firebase;

public class User {
    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        // Use for Firebase
    }
}
