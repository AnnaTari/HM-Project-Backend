package com.hansemerkur.lotteryappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class LotteryAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryAppBackendApplication.class, args);
    }

}
