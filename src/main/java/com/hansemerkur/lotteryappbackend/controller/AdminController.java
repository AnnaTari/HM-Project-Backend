package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.service.AdminService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

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
        System.out.println(httpEntity.getBody());
        System.out.println(adminService.findAdminByUsernameAndPassword().toString());
    }
}
