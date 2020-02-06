package com.xiayu.controller;

import com.xiayu.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private IMailService mailService;

    @PutMapping("/send")
    public boolean sendMail(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("content") String content){
        return mailService.sendMain(phoneNumber,content);
    }
}
