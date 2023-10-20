package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Admin;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepository {
    private static final Logger log = LoggerFactory.getLogger(AdminRepository.class);

    private final EntityManager entityManager;

    public AdminRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Admin> findAdminByUsernameAndPassword() {
        System.out.println("SQL");
        try {
             return entityManager.createNativeQuery(
                            "SELECT * FROM LotteryAdmin a", Admin.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
}
