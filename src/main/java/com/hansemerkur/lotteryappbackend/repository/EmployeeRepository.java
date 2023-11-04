package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Employee;
import com.hansemerkur.lotteryappbackend.model.Event;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class EmployeeRepository {
    private static final Logger log = LoggerFactory.getLogger(EmployeeRepository.class);

    private final EntityManager entityManager;

    public EmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Employee> registerForEvent() {
        System.out.println("register");
        try {
            return entityManager.createNativeQuery(
                            "SELECT * FROM LotteryUser a", Employee.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
    public Employee saveUser(Employee user) {
        try {
            entityManager.createNativeQuery("INSERT INTO employee (employee_email, employee_name) values (:userEmail, :userName)", Employee.class)
                    .setParameter("userEmail", user.getEmployeeEmail())
                    .setParameter("userName", user.getEmployeeName())
                    .executeUpdate();
            return (Employee) entityManager.createNativeQuery("" +
                    "SELECT max(event_hsv_id) OVER (PARTITION BY admin_id) as event_hsv from event_hsv;" +
                    "").getSingleResult();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return new Employee();
    }

}
