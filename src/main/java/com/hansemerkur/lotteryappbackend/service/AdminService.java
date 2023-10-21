package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAdminByUsernameAndPassword(String adminName, String adminPassword);
}
