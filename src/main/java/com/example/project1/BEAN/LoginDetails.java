package com.example.project1.BEAN;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LoginDetails {
    @Id
    private String email;

    private String password;

    public LoginDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginDetails() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
