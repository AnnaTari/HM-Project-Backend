package com.hansemerkur.lotteryappbackend.service;
import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;
import java.util.List;

public interface EmployeeService {
    List <Employee> registerForEvent();

    Employee saveEmployee(RegistrationDto registrationDto);
}