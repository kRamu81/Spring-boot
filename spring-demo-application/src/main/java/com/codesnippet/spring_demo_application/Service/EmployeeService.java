package com.codesnippet.spring_demo_application.Service;

import com.codesnippet.spring_demo_application.Repository.EmployeeRepository;
import com.codesnippet.spring_demo_application.dto.EmployeeDTO;
import com.codesnippet.spring_demo_application.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployee(Integer id) {
        Employee employee = employeeRepository.getEmployee(id);

        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);
    }
}
