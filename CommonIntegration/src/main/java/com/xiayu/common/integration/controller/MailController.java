package com.xiayu.common.integration.controller;

import com.xiayu.common.integration.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private IMailService mailService;

    @GetMapping("/send")
    public boolean sendMail(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("content") String content){
        return mailService.sendMain(phoneNumber,content);
    }
}
