package com.example.project1.BEAN;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee_Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Employees employee_id;

    @Column(nullable = false)
    private Date payment_date;

    @Column(nullable = false)
    private int amount;

    private String description;


    public Employee_Salary(Employees employee_id, Date payment_date, int amount, String description) {
        this.employee_id = employee_id;
        this.payment_date = payment_date;
        this.amount = amount;
        this.description = description;
    }

    public Employee_Salary() {

    }


    public int getId() {
        return id;
    }

    public Employees getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employees employee_id) {
        this.employee_id = employee_id;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
