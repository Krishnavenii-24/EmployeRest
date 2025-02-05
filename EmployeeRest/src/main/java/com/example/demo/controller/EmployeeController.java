package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;
import com.example.demo.entity.Employee;

@RestController
@RequestMapping("/emp")  // Base path
public class EmployeeController {

    @Autowired
    EmployeeService service;

    // POST method to create an employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    // GET method to fetch all employees
    @GetMapping("/all")
    public List<Employee> fetchAllEmployees() {
        return service.fetchAllEmployees();
    }

    // GET method to fetch a single employee by ID
    @GetMapping("/find/{id}")
    public Employee fetchEmployeeById(@PathVariable int id) {
        return service.fetchEmployeeById(id);
    }

    // PUT method to update an employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    // DELETE method to remove an employee by ID
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}

