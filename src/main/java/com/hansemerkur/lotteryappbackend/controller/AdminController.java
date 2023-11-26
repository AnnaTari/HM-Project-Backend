package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.dto.AdminDto;
import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import com.hansemerkur.lotteryappbackend.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    private static final Logger log = LoggerFactory.getLogger(AdminRepository.class);
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping()
    public ResponseEntity<Admin> findAdminByUsernameAndPassword(@RequestBody AdminDto admin) {
        log.info("Name"+ admin.getAdminName() + "Passwort:" + admin.getAdminPassword());
        return new ResponseEntity(adminService.findAdminByUsernameAndPassword(admin.getAdminName(), admin.getAdminPassword()), HttpStatus.OK);
    }
}
