package com.samuel.springboot_backend.controller;

import com.samuel.springboot_backend.model.Employee;
import com.samuel.springboot_backend.service.imple.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;


//    build get all employees REST API
    @GetMapping()
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

//    build get all employees by ID RESTAPI
//    http://localhost:8082/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId)
    {
        return new ResponseEntity<Employee>(employeeService.getAllEmployeesById(employeeId), HttpStatus.OK);
    }

//    build create employee restapi
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        //@RequestBody annotation allows us to retrieve the request's body and automatically convert it to Java object

        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

//    build update employee restapi
//    http://localhost:8082/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable ("id") long id,
                                                   @RequestBody Employee employee)
//    @PathVariable:- to extract values from the URL of an incoming HTTP request.
    {
        return new ResponseEntity<Employee>(employeeService.updateEmployees(employee, id), HttpStatus.OK);
    }

//    build delete employee restapi

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
    {
        employeeService.deleteEmployees(id);
        return new ResponseEntity<String>("Employee deleted Succefully!", HttpStatus.OK);
    }

}
