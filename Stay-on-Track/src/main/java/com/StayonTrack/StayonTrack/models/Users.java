package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="users")
public class Users {

    private Long id;

    public String email;
    public String username;
    public String password;

    public void setId(Long id) {
        this.id = id;
    }

    public void User(){

    }

    @Id
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


}
