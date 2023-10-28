package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Admin;

public interface AdminService {
    Admin findAdminByUsernameAndPassword(String adminName, String adminPassword);
}
