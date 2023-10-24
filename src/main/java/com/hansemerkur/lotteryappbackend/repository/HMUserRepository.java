package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.HMUser;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HMUserRepository {
    private static final Logger log = LoggerFactory.getLogger(HMUserRepository.class);

    private final EntityManager entityManager;

    public HMUserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<HMUser> registerForEvent() {
        System.out.println("SQL");
        try {
            return entityManager.createNativeQuery(
                            "SELECT * FROM LotteryUser a", HMUser.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
    public HMUser saveUser(HMUser user) {
        entityManager.persist(user);
        return user;
    }
}
