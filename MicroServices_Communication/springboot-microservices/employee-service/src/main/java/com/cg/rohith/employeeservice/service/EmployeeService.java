package com.cg.rohith.employeeservice.service;

import com.cg.rohith.employeeservice.dto.EmployeeDto;
import com.cg.rohith.employeeservice.dto.APIResponseDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
