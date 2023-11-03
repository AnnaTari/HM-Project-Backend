package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.service.WinnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/winner")

public class WinnerController {
    private final WinnerService winnerService;
    public WinnerController(WinnerController winnerController) {this.winnerService = winnerService;}

    @GetMapping()
    public List<Winner> getAllWinners() {
        return winnerService.getAllWinners();
    }

    @PostMapping("/nameWinner")
    public List<Winner> nameWinner(@RequestBody Winner winner) {
        System.out.println(winner);
        return winnerService.nameWinner(winner);
    }
}
