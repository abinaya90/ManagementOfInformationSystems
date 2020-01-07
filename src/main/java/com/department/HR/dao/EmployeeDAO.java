package com.department.HR.dao;

import com.department.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

    List<Employee> findEmployeeByDateOfJoining(String dateOfJoining);

    //List<Employee> findEmployeeByDateOfJoining(int id);

}
