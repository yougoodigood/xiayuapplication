package com.xiayu.common.integration.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {

    @Value("${xiayu.feature.mail}")
    private String mail;

    @GetMapping("/feature/mail")
    public String getPort(){
        System.out.println(mail);
        return mail;
    }

    @GetMapping("/feature/message")
    public boolean getMessage(){
        System.out.println("message");
        return true;
    }
}
