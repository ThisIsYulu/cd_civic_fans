package com.yulu.cdcivicfans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Yulu on 2018/8/24.
 */
@Controller
public class WebController {

    @RequestMapping("/login")
    public String toLogin() {
        return "/login";
    }
}
