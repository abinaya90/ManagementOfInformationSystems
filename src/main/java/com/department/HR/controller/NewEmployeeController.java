package com.department.HR.controller;

import com.department.HR.model.Employee;
import com.department.HR.service.NewEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewEmployeeController {

    @Autowired
    private NewEmployeeService newEmployeeService;

    @RequestMapping("newEmployee")
    public List<Employee> getNewEmployee(){
        return newEmployeeService.listAllEmployeeJoining();
    }
}
