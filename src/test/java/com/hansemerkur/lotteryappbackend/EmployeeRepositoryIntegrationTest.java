package com.hansemerkur.lotteryappbackend;

import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class LotteryAppBackendApplicationTests {

    @Test
    void contextLoads() {
    }

}


@DataJpaTest
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveUser() {
        // Erstellen Sie ein Employee-Objekt mit Testdaten
        Employee employee = new Employee();
        employee.setEmployeeName("John Doe");
        employee.setEmployeeEmail("john@example.com");

        // Speichern Sie das Employee-Objekt in die Datenbank
        employeeRepository.saveUser(employee);

        // Rufen Sie die Daten aus der Datenbank ab
        //Employee savedEmployee = employeeRepository.finalize(employee.getEmployeeId()).orElse(null);

        // Überprüfen Sie, ob die Daten in der Datenbank korrekt gespeichert wurden
        //assertEquals("John Doe", savedEmployee.getEmployeeName());
        //assertEquals("john@example.com", savedEmployee.getEmployeeEmail());
    }
}

