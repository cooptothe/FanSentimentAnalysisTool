package com.example.fansentimentanalysis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user") // Ensure the table name matches the database schema
public class User {

    @Id
    @Column(name = "userID")
    private int userID;

    @Column(name = "username")
    private String username;

    @Column(name = "password") // Updated from passwordHash to password
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    // Getters and setters

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
