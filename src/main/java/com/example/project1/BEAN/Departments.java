package com.example.project1.BEAN;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Departments {
    @Id
    private int department_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;

    public Departments(int department_id, String name, int capacity) {
        this.department_id = department_id;
        this.name = name;
        this.capacity = capacity;
    }

    public Departments() {

    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
