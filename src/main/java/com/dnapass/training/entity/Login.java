package com.dnapass.training.entity;

public class Login {

    private Integer userid;
    private String username;
    private String role;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Login(Integer userid, String username, String role) {
        this.userid = userid;
        this.username = username;
        this.role = role;
    }
}
