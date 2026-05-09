package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {

        employeeList.add(
                new EmployeeImpl(
                        UUID.randomUUID(),
                        "John",
                        "Doe",
                        50000,
                        28,
                        "Software Engineer",
                        "john@gmail.com",
                        Instant.now(),
                        null
                )
        );

        employeeList.add(
                new EmployeeImpl(
                        UUID.randomUUID(),
                        "Jane",
                        "Smith",
                        65000,
                        32,
                        "HR Manager",
                        "jane@gmail.com",
                        Instant.now(),
                        null
                )
        );
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeByUuid(UUID uuid) {

        return employeeList.stream()
                .filter(employee -> employee.getUuid().equals(uuid))
                .findFirst()
                .orElse(null);
    }

    public Employee createEmployee(EmployeeImpl employee) {

        employee.setUuid(UUID.randomUUID());

        employeeList.add(employee);

        return employee;
    }
}