package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

import static java.time.LocalTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
public class EmployeeController {

    private final EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
    @GetMapping("list")
    @ResponseStatus(HttpStatus.OK)
    public Collection<EmployeeDTO> getEmployees(){
        return employeeService.getEmployees();
    }

}
