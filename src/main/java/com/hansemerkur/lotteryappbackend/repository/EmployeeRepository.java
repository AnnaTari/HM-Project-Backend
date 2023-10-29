package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Employee;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeRepository {
    private static final Logger log = LoggerFactory.getLogger(EmployeeRepository.class);

    private final EntityManager entityManager;

    public EmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Employee> registerForEvent() {
        System.out.println("SQL");
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
        entityManager.persist(user);
        return user;
    }
}
