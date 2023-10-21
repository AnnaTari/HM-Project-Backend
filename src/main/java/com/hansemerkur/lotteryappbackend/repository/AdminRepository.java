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

    public List<Admin> findAdminByUsernameAndPassword(String adminName, String adminPassword) {
        System.out.println("SQL");
        try {
            return entityManager.createNativeQuery(
                            "SELECT * FROM hm_admin a where a.admin_name = :adminName AND a.admin_password = :adminPassword", Admin.class)
                    .setParameter("adminName", adminName)
                    .setParameter("adminPassword", adminPassword)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
}
