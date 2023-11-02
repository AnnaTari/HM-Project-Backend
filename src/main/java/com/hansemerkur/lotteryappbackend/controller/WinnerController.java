package com.hansemerkur.lotteryappbackend.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/winner")

public class WinnerController {
    private final WinnerService winnerservice;
    public WinnerController(WinnerController winnerController) {this.winnerservice = winnerService;}

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
