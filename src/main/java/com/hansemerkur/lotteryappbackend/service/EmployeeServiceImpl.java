package com.hansemerkur.lotteryappbackend.service;

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

    public Employee saveUser(Employee user) {
        // Implementieren Sie hier die Logik zum Speichern des Benutzers in der Datenbank
        return EmployeeRepository.saveUser(user);
    }
}
