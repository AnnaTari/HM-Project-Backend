package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Accepts only requests from this origin for the endpoint admin
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //for the endpoint admin -> you have the request if there is an admin for this username and password
    @PostMapping()
    public ResponseEntity<Admin> findAdminByUsernameAndPassword(@RequestBody Admin admin) {
        LOGGER.info(String.valueOf(admin));
        return new ResponseEntity(adminService.findAdminByUsernameAndPassword(admin.getAdminName(), admin.getAdminPassword()), HttpStatus.OK);
    }
}
