package com.dnapass.training.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mobileNumber, state, city, pinCode, role, username, password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public User() {}

    public User(Integer id, String username, String mobileNumber) {
        this.id = id;
        this.username = username;
        this.mobileNumber = mobileNumber;
    }

    public User(Integer id, String mobileNumber, String state, String city, String pinCode, String role, String username, String password) {
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.role = role;
        this.username = username;
        this.password = password;
    }

    public User(String mobilenumber, String state, String city, String pincode, String role, String username, String password) {
        this.mobileNumber = mobilenumber;
        this.state = state;
        this.city = city;
        this.pinCode = pincode;
        this.role = role;
        this.username = username;
        this.password = password;
    }

}
