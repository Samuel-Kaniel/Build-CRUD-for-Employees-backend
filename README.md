# Build-CRUD-for-Employees-backend
# Overview

The "Build CRUD for Employees Backend" project is a Spring Boot application designed to handle employee data using RESTful APIs. It provides endpoints for creating, reading, updating, and deleting employee records in the backend system. The application utilizes Spring Data JPA for database interactions and follows RESTful conventions for efficient and standardized communication.

# Technologies Used
* Java 8
* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok (Java library that simplifies the development process by reducing boilerplate code in Java classes.)
* Maven (as the build tool)
* MySQL (or any other compatible database)

# Project Structure
The project follows a standard Spring Boot project structure:


|- src

    |- main
        |- java
            |- com.samuel.springboot_backend
                |- controller
                    |- EmployeeController.java
                |- model
                    |- Employee.java
                |- repository
                    |- EmployeeRepository.java
                |- service
                    |- EmployeeService.java
                    |- impl
                        |- EmployeeServiceImpl.java
        |- resources
            |- application.properties
    |- test
        |- java
            |- com.samuel.springboot_backend
                |- controller
                    |- EmployeeControllerTest.java
                |- service
                    |- EmployeeServiceTest.java



# How to Use
# Setup
* Clone the project from the repository.
* Configure the database connection in the application.properties file. Modify the following properties with your database credentials:

```
spring.datasource.url=jdbc:mysql://your_database_host:your_database_port/your_database_name  
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
```
* Provided configuration is for setting up Hibernate properties in a Spring Boot application that uses JPA for database access. Below is an explanation of each property:
    - ``` spring.jpa.properties.hibernate.dialect ``` :- This property sets the Hibernate dialect for the database being used. In this case, it is set to org.hibernate.dialect.MySQL57Dialect, which means Hibernate will use the MySQL 5.7 dialect to generate appropriate SQL statements compatible with MySQL 5.7.
    - ``` spring.jpa.hibernate.ddl-auto ``` :- This property determines how Hibernate handles the database schema during startup. The value update instructs Hibernate to update the schema automatically based on the entity classes and their mappings. If the schema does not exist, it will be created. If it already exists, Hibernate will modify the schema to match the current entity definitions while trying to preserve existing data. Be cautious when using this setting in production to avoid data loss.
  - ``` server.port ``` :- This property sets the port on which the Spring Boot application will run. In this case, the application will be accessible at http://localhost:8082.
  
##[Please ensure that you have correctly configured the MySQL database connection properties (e.g., spring.datasource.url, spring.datasource.username, spring.datasource.password, etc.) in the application.properties file to establish a successful connection with the MySQL database]

* Build the project using Maven: " mvn clean install "
* Run the Spring Boot application: " mvn spring-boot:run "


# Endpoints
* **GET /api/employees** : Get all employees.
* **GET /api/employees/{id}**: Get an employee by ID.
* **POST /api/employees**: Create a new employee.
* **PUT /api/employees/{id}**: Update an existing employee by ID.
* **DELETE /api/employees/{id}**: Delete an employee by ID.

<hr>


With this "Build CRUD for Employees Backend" project, you can easily manage employee data through the provided RESTful APIs. The application's structure and use of industry-standard technologies ensure that it can be efficiently extended and maintained for larger and more complex projects.


