package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.HMUser;
import com.hansemerkur.lotteryappbackend.repository.HMUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HMUserServiceImpl implements HMUserService {

    private final HMUserRepository HMUserRepository;

    public HMUserServiceImpl(HMUserRepository HMUserRepository) {
        this.HMUserRepository = HMUserRepository;
    }

    @Override
    public List<HMUser> registerForEvent() {return HMUserRepository.registerForEvent();}

    public HMUser saveUser(HMUser user) {
        // Implementieren Sie hier die Logik zum Speichern des Benutzers in der Datenbank
        return HMUserRepository.saveUser(user);
    }
}
