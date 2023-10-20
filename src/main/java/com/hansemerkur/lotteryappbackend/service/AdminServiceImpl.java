package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Admin;
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
    public List<Admin> findAdminByUsernameAndPassword() {
        return adminRepository.findAdminByUsernameAndPassword();
    }
}
