package com.calvin.Val.Pass.user;

public class User {
    private long id;
    private String name;
    private String loginToken;
    private String email;
    public int totalEXP;

    public User(){

    }

    public User(long id, String name, String loginToken, String email, int totalEXP) {
        this.id = id;
        this.name = name;
        this.loginToken = loginToken;
        this.email = email;
        this.totalEXP = totalEXP;
    }

    //without id
    public User(String name, String loginToken, String email, int totalEXP) {
        this.name = name;
        this.loginToken = loginToken;
        this.email = email;
        this.totalEXP = totalEXP;
    }

    //getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public String getEmail() {
        return email;
    }

    public int getTotalEXP() {
        return totalEXP;
    }

    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTotalEXP(int totalEXP) {
        this.totalEXP = totalEXP;
    }

    //to string
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loginToken='" + loginToken + '\'' +
                ", email='" + email + '\'' +
                ", totalEXP=" + totalEXP +
                '}';
    }
}
