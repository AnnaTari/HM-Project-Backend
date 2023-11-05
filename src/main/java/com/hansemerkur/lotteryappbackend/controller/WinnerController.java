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
    public WinnerController(WinnerService winnerService) {this.winnerService = winnerService;}


    //get attendances, name winners and give out winners
    @GetMapping(value = "")
    public List<Winner> findAllParticipants() {
        return winnerService.findAllParticipants();
    }

    @PostMapping("/nameWinner")
    public List<Winner> nameWinner(@RequestBody Winner winner) {
        System.out.println(winner);
        return (List<Winner>) winnerService.nameWinner(winner);
    }
}
