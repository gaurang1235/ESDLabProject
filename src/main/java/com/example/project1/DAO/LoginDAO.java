package com.example.project1.DAO;

import com.example.project1.BEAN.Employees;
import com.example.project1.BEAN.LoginDetails;

public interface LoginDAO {

    Employees login(String email, String pass);

    void createLogin(LoginDetails loginDetails);

}
