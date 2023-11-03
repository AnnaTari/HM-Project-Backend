package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;

    public WinnerServicelmpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }

    @Override
    public List<Winner> getAllWinners() {
        return winnerRepository.getAllWinners();
    }

    @Override
    public List<Winner> nameWinner(Winner winner) {
        return winnerRepository.nameWinner(winner);
    }
}
