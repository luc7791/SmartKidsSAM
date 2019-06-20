package com.lucas.sda.kids.model;

import javax.persistence.*;

@Entity
@Table (name ="users")
public class Users {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator( name = "user_seq_gen", sequenceName = "user_seq", allocationSize = 1)

    @Column(name = "idusers")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String passwrd;

    private String  email;

    @Column(name = "vbucks")
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
