package com.department.HR.service;

import com.department.HR.dao.EmployeeDAO;
import com.department.HR.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NewEmployeeServiceImpl implements NewEmployeeService{

    private static final Logger logger = LoggerFactory.getLogger(NewEmployeeServiceImpl.class);

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> listAllEmployeeJoining() {
        logger.debug("Inside ListOfAllEmployeeJoined");
        //return employeeDAO.findEmployeeByDateOfJoining(java.time.LocalDate.now());
        return employeeDAO.findEmployeeByDateOfJoining(LocalDate.parse("2019-12-14"));
    }
}
