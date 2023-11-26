package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Winner;

import java.util.List;

 //method "selectWinners" that WinnerService implements
public interface WinnerService {

    List<Winner> selectWinners(Long eventHsvId);

}
