package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
    // JpaRepository provides all CRUD operations, no additional code needed here
}
