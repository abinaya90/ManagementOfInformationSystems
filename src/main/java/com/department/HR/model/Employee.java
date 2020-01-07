package com.department.HR.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee_detail")
@NamedQuery(name = "Employee.findEmployeeByDateOfJoining",
        query = "select e from Employee e where e.dateOfJoining = ?1")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String designation;

    private String dateOfJoining;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", email='" + email + '\'' +
                '}';
    }
}
