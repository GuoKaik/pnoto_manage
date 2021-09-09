package com.gk.pnoto_manage.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("1111");
        return "111";
    }
}
