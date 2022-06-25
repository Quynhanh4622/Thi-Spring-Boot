package com.example.thispb.restApi;

import com.example.thispb.entitty.Employee;
import com.example.thispb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class EmployeeApi {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getList() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEprisee(employee));
    }
}
