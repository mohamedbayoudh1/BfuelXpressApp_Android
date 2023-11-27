package com.example.mysignupapp;





public class UsersItem {

    String userID;
    String userName;
    String userEmail;
    String userCountry;

    public UsersItem() {
    }

    public UsersItem(String userID, String userName, String userEmail, String userCountry) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCountry = userCountry;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
}
