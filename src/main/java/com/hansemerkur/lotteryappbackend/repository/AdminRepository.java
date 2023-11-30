package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Admin;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

//connects to the table hm_admin
@Repository
public class AdminRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminRepository.class);

    //With the entityManager you can make sql queries
    private final EntityManager entityManager;

    public AdminRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //finds the admin entry in hm_admin with the unique username and password combination
    public Admin findAdminByUsername(String adminName) {
        try {
            return (Admin) entityManager.createNativeQuery(
                            "SELECT * FROM hm_admin a where a.admin_name = :adminName", Admin.class)
                    .setParameter("adminName", adminName)
                    .getSingleResult();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
        return new Admin();
    }
}
