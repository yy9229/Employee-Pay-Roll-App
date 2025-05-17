package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/")
    public String getMessage() {
        return "Welcome to Employee Payroll App!";
    }

    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Get Call Success for ID: " + id;
    }

    @PostMapping("/create")
    public String createEmployee(@RequestBody String employee) {
        return "Created Employee: " + employee;
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody String employee) {
        return "Updated Employee: " + employee;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee with ID: " + id;
    }
    
    @GetMapping("/testdto")
    public EmployeePayrollDTO getTestDTO() {
        return new EmployeePayrollDTO("John Doe", 50000);
    }

    @GetMapping("/testmodel")
    public EmployeePayrollData getTestModel() {
        return new EmployeePayrollData(1, "Jane Doe", 60000);
    }

}
