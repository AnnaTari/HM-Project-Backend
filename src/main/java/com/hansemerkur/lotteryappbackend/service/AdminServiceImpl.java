package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin findAdminByUsernameAndPassword(String adminName, String adminPassword) {
        Admin admin = adminRepository.findAdminByUsername(adminName);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        boolean passwordMatches = encoder.matches(adminPassword, admin.getAdminPassword());
        if (passwordMatches) {
            return admin;
        } else {
            return new Admin();
        }
    }
}
