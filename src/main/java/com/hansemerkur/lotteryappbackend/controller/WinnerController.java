package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import com.hansemerkur.lotteryappbackend.service.WinnerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/winner")

public class WinnerController {
    private final WinnerService winnerService;
    public WinnerController(WinnerService winnerService) {this.winnerService = winnerService;}


    //get attendances, name winners and give out winners
    @PostMapping("/api/winner/{eventHsvId}")
    public List<Winner> startLottery(@PathVariable Long eventHsvId) {
        return winnerService.selectWinners(eventHsvId);
    }

}
