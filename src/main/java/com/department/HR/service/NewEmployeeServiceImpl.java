package com.department.HR.service;

import com.department.HR.dao.EmployeeDAO;
import com.department.HR.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewEmployeeServiceImpl implements NewEmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> listAllEmployeeJoining() {
        return employeeDAO.findAll();
    }
}
