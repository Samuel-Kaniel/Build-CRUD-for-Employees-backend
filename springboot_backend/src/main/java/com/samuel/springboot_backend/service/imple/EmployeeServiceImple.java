package com.samuel.springboot_backend.service.imple;

import com.samuel.springboot_backend.exception.ResourceNotFoundException;
import com.samuel.springboot_backend.model.Employee;
import com.samuel.springboot_backend.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImple implements EmployeeService{



    private EmployeeRespository employeeRespository;

//    @Autowired
//    public EmployeeServiceImple(EmployeeRespository employeeRespository) {
//        super();
//        this.employeeRespository = employeeRespository;
//    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRespository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll(); //finalAll() list of all the employees
    }

    @Override
    public Employee getAllEmployeesById(long id) {
//        Optional<Employee> employee =  employeeRespository.findById(id);
//
//        if(employee.isPresent())
//        {
//            return employee.get(); // return the content of the employee object
//        }
//        else {
//            throw new ResourceNotFoundException("Employee","Id", id);
//        }
//        lambda expression - Java 8 features
        return employeeRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id",id));
    }

//    Update employees
    @Override
    public Employee updateEmployees(Employee employee, long id) {

//        check whether employee with given id is existing database or not
        Employee existingEmployee = employeeRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id", id));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
//        save the existing employee to database
        employeeRespository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployees(long id) {
//        check whether the employee exist in the database or not
        employeeRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id", id));
        employeeRespository.deleteById(id);
    }


}
