package com.example.project1.Driver;

import com.example.project1.BEAN.Departments;
import com.example.project1.BEAN.Employee_Salary;
import com.example.project1.BEAN.Employees;
import com.example.project1.BEAN.LoginDetails;
import com.example.project1.DAO.DepartmentDAO;
import com.example.project1.DAO.EmployeeDAO;
import com.example.project1.DAO.Employee_SalaryDAO;
import com.example.project1.DAO.Implementation.DepartmentDAOImpl;
import com.example.project1.DAO.Implementation.EmployeeDAOImpl;
import com.example.project1.DAO.Implementation.Employee_SalaryDAOImpl;
import com.example.project1.DAO.Implementation.LoginDAOImpl;
import com.example.project1.DAO.LoginDAO;

import java.util.Date;

public class DriverClass {
    public static void main(String args[]) {

        Departments d1 = new Departments(101, "Accounts", 50);
        Departments d2 = new Departments(102, "Admin", 30);
        Departments d3 = new Departments(103, "Faculty", 80);
        Departments d4 = new Departments(104, "Security", 50);

        DepartmentDAO depDao = new DepartmentDAOImpl();

        depDao.createDepartment(d1);
        depDao.createDepartment(d2);
        depDao.createDepartment(d3);
        depDao.createDepartment(d4);


        Employees e1 = new Employees(101, "Gaurang", "Agarwal", "gaurang.agarwal@iiitb.ac.in", "Professor", "NA", d3);
        Employees e2 = new Employees(102, "Utsav", "Singh", "utsav.singh@iiitb.ac.in", "Guard", "NA", d4);
        Employees e3 = new Employees(103, "Sarthak", "Tyagi", "tyagi.sarthak@iiitb.ac.in", "Accountant", "NA", d1);
        Employees e4 = new Employees(104, "Ram", "Gopal", "ram.gopal@iiitb.ac.in", "Professor", "NA", d3);
        Employees e5 = new Employees(105, "Rashi", "Soni", "Rashi.soni@iiitb.ac.in", "Receptionist", "NA", d2);
        Employees e6 = new Employees(106, "Gaurav", "Singh", "gaurav.singh@iiitb.ac.in", "Professor", "NA", d3);
        Employees e7 = new Employees(107, "Bobby", "Deol", "bobby.deol@iiitb.ac.in", "Guard Head", "NA", d4);
        Employees e8 = new Employees(108, "Antriksh", "Gupta", "antriksh.gupta@iiitb.ac.in", "Senior Accountant", "NA", d1);
        Employees e9 = new Employees(109, "Rani", "Desai", "rani.desai@iiitb.ac.in", "Facility Manager", "NA", d2);

        EmployeeDAO empDao = new EmployeeDAOImpl();

        empDao.createEmployee(e1);
        empDao.createEmployee(e2);
        empDao.createEmployee(e3);
        empDao.createEmployee(e4);
        empDao.createEmployee(e5);
        empDao.createEmployee(e6);
        empDao.createEmployee(e7);
        empDao.createEmployee(e8);
        empDao.createEmployee(e9);


        Employee_Salary emp_sal1 = new Employee_Salary(e1, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal2 = new Employee_Salary(e1, new Date(2022, 10, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal3 = new Employee_Salary(e2, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal4 = new Employee_Salary(e2, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal5 = new Employee_Salary(e3, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal6 = new Employee_Salary(e3, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal7 = new Employee_Salary(e4, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal8 = new Employee_Salary(e4, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal9 = new Employee_Salary(e5, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal10 = new Employee_Salary(e5, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal11 = new Employee_Salary(e6, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal12 = new Employee_Salary(e6, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal13 = new Employee_Salary(e7, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal14 = new Employee_Salary(e7, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal15 = new Employee_Salary(e8, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal16 = new Employee_Salary(e8, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal17 = new Employee_Salary(e9, new Date(2022, 11, 24), 50000, "Payment Clear");
        Employee_Salary emp_sal18 = new Employee_Salary(e9, new Date(2022, 11, 24), 50000, "Payment Clear");

        Employee_SalaryDAO esalDao = new Employee_SalaryDAOImpl();

        esalDao.createSalary(emp_sal1);
        esalDao.createSalary(emp_sal2);
        esalDao.createSalary(emp_sal3);
        esalDao.createSalary(emp_sal4);
        esalDao.createSalary(emp_sal5);
        esalDao.createSalary(emp_sal6);
        esalDao.createSalary(emp_sal7);
        esalDao.createSalary(emp_sal8);
        esalDao.createSalary(emp_sal9);
        esalDao.createSalary(emp_sal10);
        esalDao.createSalary(emp_sal11);
        esalDao.createSalary(emp_sal12);
        esalDao.createSalary(emp_sal13);
        esalDao.createSalary(emp_sal14);
        esalDao.createSalary(emp_sal15);
        esalDao.createSalary(emp_sal16);
        esalDao.createSalary(emp_sal17);
        esalDao.createSalary(emp_sal18);


        LoginDetails ld1 = new LoginDetails(e1.getEmail(), "1234");
        LoginDetails ld2 = new LoginDetails(e2.getEmail(), "1234");
        LoginDetails ld3 = new LoginDetails(e3.getEmail(), "1234");
        LoginDetails ld4 = new LoginDetails(e4.getEmail(), "1234");
        LoginDetails ld5 = new LoginDetails(e5.getEmail(), "1234");
        LoginDetails ld6 = new LoginDetails(e6.getEmail(), "1234");
        LoginDetails ld7 = new LoginDetails(e7.getEmail(), "1234");
        LoginDetails ld8 = new LoginDetails(e8.getEmail(), "1234");
        LoginDetails ld9 = new LoginDetails(e9.getEmail(), "1234");

        LoginDAO loginDAO = new LoginDAOImpl();

        loginDAO.createLogin(ld1);
        loginDAO.createLogin(ld2);
        loginDAO.createLogin(ld3);
        loginDAO.createLogin(ld4);
        loginDAO.createLogin(ld5);
        loginDAO.createLogin(ld6);
        loginDAO.createLogin(ld7);
        loginDAO.createLogin(ld8);
        loginDAO.createLogin(ld9);
    }
}
