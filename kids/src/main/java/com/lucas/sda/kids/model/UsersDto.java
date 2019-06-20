package com.lucas.sda.kids.model;

import javax.persistence.Column;

public class UsersDto {

     private Integer id;

    private String userName;

    private String passwrd;

    private String  email;

    private String vBucks;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getvBucks() {
        return vBucks;
    }

    public void setvBucks(String vBucks) {
        this.vBucks = vBucks;
    }
}
