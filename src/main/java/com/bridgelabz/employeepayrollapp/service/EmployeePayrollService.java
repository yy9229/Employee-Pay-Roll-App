package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    private int employeeIdCounter = 1;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        Optional<EmployeePayrollData> empData = employeePayrollList.stream()
                .filter(emp -> emp.getEmployeeId() == empId)
                .findFirst();
        return empData.orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(employeeIdCounter++, empPayrollDTO.getName(), empPayrollDTO.getSalary());
        employeePayrollList.add(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        if(empData != null){
            empData.setName(empPayrollDTO.getName());
            empData.setSalary(empPayrollDTO.getSalary());
            return empData;
        }
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollList.removeIf(emp -> emp.getEmployeeId() == empId);
    }
}
