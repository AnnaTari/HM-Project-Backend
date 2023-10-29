package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.HMUser;
import com.hansemerkur.lotteryappbackend.service.HMUserService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/event-page")
public class HMUserController {
    private HMUserService hm_userservice;

    public HMUserController(HMUserService HMUserService) {
        this.hm_userservice = HMUserService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void registerForEvent(HttpEntity<HMUser> httpEntity) {
        System.out.println(httpEntity.getBody());
        System.out.println(hm_userservice.registerForEvent().toString());
    }

    public HMUser saveUser(@RequestBody HMUser user) {
        return hm_userservice.saveUser(user);
    }


}

