package com.hansemerkur.lotteryappbackend;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {
    private int id;
    private String username;
    private String password;
}
