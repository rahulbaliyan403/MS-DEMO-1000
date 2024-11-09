package com.home.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int userId;

    @Column(name = "NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String userPassword;

    @Column(name = "EMAIL")
    private String userEmail;

    @Column(name = "SALARY")
    private double userSalary;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public double getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(double userSalary) {
        this.userSalary = userSalary;
    }
}
