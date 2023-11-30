package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(RegistrationDto registrationDto);
}