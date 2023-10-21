package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.dto.AdminDto;
import com.hansemerkur.lotteryappbackend.entity.Admin;
import com.hansemerkur.lotteryappbackend.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping()
    public ResponseEntity<Admin> findAdminByUsernameAndPassword(@RequestBody AdminDto admin) {
        System.out.println("Name" + admin.getAdminName() + " Passwort:" + admin.getAdminPassword());
        return new ResponseEntity(adminService.findAdminByUsernameAndPassword(admin.getAdminName(), admin.getAdminPassword()), HttpStatus.OK);
    }
}
