package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.service.EmployeeService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/event-page")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.employeeService = EmployeeService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void registerForEvent(HttpEntity<Employee> httpEntity) {
        System.out.println(httpEntity.getBody());
        System.out.println(employeeService.registerForEvent().toString());
    }

    public Employee saveUser(@RequestBody Employee user) {
        return employeeService.saveUser(user);
    }


}

