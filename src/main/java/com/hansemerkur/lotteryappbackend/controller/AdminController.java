package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.service.AdminService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void findAdminByUsernameAndPassword(HttpEntity<Admin> httpEntity) {
        System.out.println("Start");
        if (adminService.findAdminByUsernameAndPassword(Objects.requireNonNull(httpEntity.getBody()).getAdminname(), httpEntity.getBody().getPassword()).size() != 0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
