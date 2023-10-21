package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.entity.Admin;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin findAdminByUsernameAndPassword(String adminName, String adminPassword) {
        return adminRepository.findAdminByUsernameAndPassword(adminName, adminPassword);
    }
}
