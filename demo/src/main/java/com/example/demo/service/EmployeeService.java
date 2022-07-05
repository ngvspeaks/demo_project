package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    @Autowired
    EmployeeDTO employeeDTO;

    @Autowired
    Employee employee;
    public Collection<EmployeeDTO> getEmployees() {
        List<EmployeeDTO> empList = new ArrayList<>();
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setEmpName(employee.getEmpName());
        employeeDTO.setEmpId(employee.getEmpId());
        empList.add(employeeDTO);

        return empList;
    }
}
