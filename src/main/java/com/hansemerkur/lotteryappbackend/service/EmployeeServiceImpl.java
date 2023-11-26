package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository EmployeeRepository;

    public EmployeeServiceImpl(EmployeeRepository EmployeeRepository) {
        this.EmployeeRepository = EmployeeRepository;
    }

     @Override
    public List<Employee> registerForEvent() {return EmployeeRepository.registerForEvent();}

    @Override
    public Employee saveEmployee(RegistrationDto registrationDto) {
        // logic to save employee in db
        return EmployeeRepository.saveEmployee(registrationDto);
    }
}
