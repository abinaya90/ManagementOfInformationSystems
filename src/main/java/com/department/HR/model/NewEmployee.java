package com.department.HR.model;

import java.util.List;

public class NewEmployee {

    private List<Employee> employeeDetails;

    public List<Employee> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<Employee> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
}