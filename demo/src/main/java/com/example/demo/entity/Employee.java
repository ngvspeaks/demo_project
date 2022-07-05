package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Value("${employee-id}")
    int empId;
    @Value("${employee-name}")
    String empName;
    @Value("${employee-age}")
    int age;
    @Value("${employee-dept}")
    String department;

}
