package com.department.HR.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee_detail")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="FirstName", nullable = false)
    private String firstName;

    @Column(name="LastName", nullable = false)
    private String lastName;

    @Column(name="Designation", nullable = false)
    private String designation;

    /*@Column(name="DateOfJoining", nullable = true)
    @Temporal(value = TemporalType.DATE)
    private Date dateOfJoining;*/

    @Column(name="Email", nullable = false)
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
