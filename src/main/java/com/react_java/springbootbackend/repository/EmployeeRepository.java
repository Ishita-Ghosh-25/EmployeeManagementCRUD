package com.react_java.springbootbackend.repository;

import com.react_java.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //CRUD Database Methods

}
