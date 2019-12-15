package com.department.HR.controller;

import com.department.HR.model.NewEmployee;
import com.department.HR.service.NewEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewEmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewEmployeeController.class);

    @Autowired
    private NewEmployeeService newEmployeeService;

    @RequestMapping("newEmployee")
    public NewEmployee getNewEmployee(){
        LOGGER.debug("Inside the get Request for New Employee Joined today -- Started");
        NewEmployee newEmployee = new NewEmployee();
        newEmployee.setEmployeeDetails(newEmployeeService.listAllEmployeeJoining());
        LOGGER.debug("Inside the get Request for New Employee Joined today -- Ended");
        return newEmployee;
    }
}
