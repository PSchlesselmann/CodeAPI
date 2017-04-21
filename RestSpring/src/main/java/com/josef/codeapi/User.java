package com.josef.codeapi;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "user")
    public class User {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long ID;

    @NotNull
    private String name;

    @NotNull
    private String first_name;

    @NotNull
    private String mail;

    @NotNull
    private String slack_link;

    private String icon;

    @NotNull
    private int semester;

    @NotNull
    private String password;




    // Public methods

    public User() {
    }

    public User(long ID) {
        this.ID = ID;
    }

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSlack_link() {
        return slack_link;
    }

    public void setSlack_link(String slack_link) {
        this.slack_link = slack_link;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}


