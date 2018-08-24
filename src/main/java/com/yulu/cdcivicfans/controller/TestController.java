package com.yulu.cdcivicfans.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yulu on 2018/8/24.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/say.html")
    public String getUserById() {
        return "it is cd cdcivicfans fans club!";
    }
}
