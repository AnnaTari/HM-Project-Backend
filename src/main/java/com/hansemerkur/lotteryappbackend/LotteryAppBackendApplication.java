package com.hansemerkur.lotteryappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class LotteryAppBackendApplication {

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/findAllUsers")
    public List<Users> getUsers() {
        return List.of(
                new Users(1, "Anna", "1234"),
                new Users(2, "Melanie", "2e"),
                new Users(3, "Sarah", "23")
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(LotteryAppBackendApplication.class, args);
    }

}
