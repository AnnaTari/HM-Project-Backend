package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.dto.RegistrationDto;
import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.model.Attendance;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

 // connection to db tables
@Transactional
@Repository
public class EmployeeRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRepository.class);

    // sql queries possible
    private final EntityManager entityManager;

    public EmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // Check if an employee with the given email already exists in the database
    public boolean employeeExists(String employeeEmail) {
        try {
            long count = (long) entityManager.createNativeQuery(
                            "SELECT COUNT(*) FROM employee WHERE employee_email = :employeeEmail")
                    .setParameter("employeeEmail", employeeEmail)
                    .getSingleResult();
            // Return true if the count is greater than 0
            return count > 0;
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            return false;
        }
    }

    public Employee saveEmployee(RegistrationDto registrationDto) {

        try {
            String employeeEmail = registrationDto.getEmployee().getEmployeeEmail();

            // Check if the employee already exists
            if (employeeExists(employeeEmail)) {
                LOGGER.warn("Mitarbeiter mit E-Mail-Adresse {} existiert bereits.", employeeEmail);
                return new Employee();
            }


            try {
                // Insert employee into the 'employee' database table
                entityManager.createNativeQuery("INSERT INTO employee (employee_email, employee_name) values (:userEmail, :userName)", Employee.class)
                        .setParameter("userEmail", registrationDto.getEmployee().getEmployeeEmail())
                        .setParameter("userName", registrationDto.getEmployee().getEmployeeName())
                        .executeUpdate();


                // Retrieve the ID of the newly inserted employee
                int employeeId = (int) entityManager.createNativeQuery("SELECT TOP 1 employee_id FROM Employee ORDER BY employee_id DESC").getSingleResult();
                System.out.println(employeeId);

                // Check if the employee is already in the blacklist
                long blacklistCount = (long) entityManager.createNativeQuery(
                                "SELECT COUNT(*) FROM blacklist WHERE employee_id = :employeeId")
                        .setParameter("employeeId", employeeId)
                        .getSingleResult();

                // If the employee is not in the blacklist, insert into the blacklist table
                if (blacklistCount == 0) {
                    // Retrieve the ID of the newly inserted employee
                    entityManager.createNativeQuery("INSERT INTO blacklist (employee_id, blacklist_counter) values (:employeeId, 0)")
                            .setParameter("employeeId", employeeId)
                            .executeUpdate();
                }

                // Insert employee attendance into the 'hm_attendance' database table
                entityManager.createNativeQuery("INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) values (:employeeId, :eventHsvId, :escortName, :winner, :substituteWinner)", Attendance.class)
                        .setParameter("employeeId", employeeId)
                        .setParameter("eventHsvId", registrationDto.getEventHsvId())
                        .setParameter("escortName", registrationDto.getEscortName())
                        .setParameter("winner", registrationDto.getWinner())
                        .setParameter("substituteWinner", registrationDto.getSubstituteWinner())
                        .executeUpdate();


                // Retrieve and return the employee based on their ID
                return (Employee) entityManager.createNativeQuery("SELECT * FROM employee WHERE employee_id = :employeeId", Employee.class)
                        .setParameter("employeeId", employeeId)
                        .getSingleResult();
            } catch (Exception e) {
                LOGGER.warn(e.getMessage());
            }
            return new Employee();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
        return new Employee();
    }
}
