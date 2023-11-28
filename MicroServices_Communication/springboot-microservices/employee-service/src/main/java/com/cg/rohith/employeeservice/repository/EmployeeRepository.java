package com.cg.rohith.employeeservice.repository;

import com.cg.rohith.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
