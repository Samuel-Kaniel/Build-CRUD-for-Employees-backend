package com.samuel.springboot_backend.model;

import jakarta.persistence.*;
import lombok.Data;

//@Data // use the lombok library to reduce boilerplate code such as
// getters, setters, constructors, toString, equals and hashcode methods for java class
@Entity // @Entity annotation specifies that the class is an entity.
@Table(name = "employees") // @Table anootation speecifies the table in the database with which this entity is mapped.
public class Employee {

    @Id //@Id annotation specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GenerateValue annotation specifies the generation strategies for the values of primary keys

    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    public Employee(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
