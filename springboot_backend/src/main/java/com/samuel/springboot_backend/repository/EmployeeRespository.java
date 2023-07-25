package com.samuel.springboot_backend.repository;

import com.samuel.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//(type of the entity, type of the primary key)
//JPA Repository -> contain the @Repository so no need to add this annonation

// Spring data JPA made JPARepository methods transactional so we
// no need to add @Transactional annotation in Service class


//create an exceptional:
//
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}
