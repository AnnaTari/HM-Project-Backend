package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.HMUser;

import java.util.List;

public interface HMUserService {
    List <HMUser> registerForEvent();

    HMUser saveUser(HMUser user);
}