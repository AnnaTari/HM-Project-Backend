package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin findAdminByUsernameAndPassword(String adminName, String adminPassword);
}
