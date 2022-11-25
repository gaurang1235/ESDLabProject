package com.example.project1.DAO;

import com.example.project1.BEAN.Employee_Salary;

import java.util.List;

public interface Employee_SalaryDAO {
    List<Employee_Salary> getSalary(int empId);

    void createSalary(Employee_Salary s);
}
