package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.employeeService = EmployeeService;
    }

    // Post request to save employee
    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Employee saveEmployee(@RequestBody RegistrationDto registrationDto) {
        System.out.println("Employee");
        System.out.println(registrationDto);
        return employeeService.saveEmployee(registrationDto);
    }

}

