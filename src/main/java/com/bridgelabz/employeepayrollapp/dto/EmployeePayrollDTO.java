package com.bridgelabz.employeepayrollapp.DTO;

public class EmployeePayrollDTO {
    private String name;
    private int salary;

    // Constructor
    public EmployeePayrollDTO(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
