package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import com.hansemerkur.lotteryappbackend.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/event-page")
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(AdminRepository.class);
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.employeeService = EmployeeService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void registerForEvent(HttpEntity<Employee> httpEntity) {
        log.info(String.valueOf(httpEntity.getBody()));
        log.info(employeeService.registerForEvent().toString());
    }

    public Employee saveUser(@RequestBody Employee user) {
        return employeeService.saveUser(user);
    }


}

