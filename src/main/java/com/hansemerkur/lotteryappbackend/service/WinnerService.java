package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Winner;

import java.util.List;

public interface WinnerService {

    List<Winner> selectWinners(Long eventHsvId);

}
