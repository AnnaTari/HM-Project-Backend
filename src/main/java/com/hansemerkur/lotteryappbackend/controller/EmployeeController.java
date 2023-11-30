package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.employeeService = EmployeeService;
    }

    // Post request to save employee
    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Employee saveEmployee(@RequestBody RegistrationDto registrationDto) {
        LOGGER.info("Employee");
        LOGGER.info(String.valueOf(registrationDto));
        return employeeService.saveEmployee(registrationDto);
    }

}

