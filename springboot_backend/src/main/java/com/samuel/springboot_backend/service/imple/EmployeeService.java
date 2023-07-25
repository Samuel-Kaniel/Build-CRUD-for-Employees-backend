package com.samuel.springboot_backend.service.imple;

import com.samuel.springboot_backend.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getAllEmployeesById(long id);

    Employee updateEmployees(Employee employee, long id);

    void deleteEmployees(long id);
}
