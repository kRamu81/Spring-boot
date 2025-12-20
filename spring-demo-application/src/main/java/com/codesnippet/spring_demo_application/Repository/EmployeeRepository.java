package com.codesnippet.spring_demo_application.Repository;

import com.codesnippet.spring_demo_application.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(Integer id) {
        return new Employee(1, "chetan", "IT", 27);
    }
}
