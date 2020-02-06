package com.xiayu.user.service.controller;

import com.xiayu.user.service.service.IUserService;
import com.xiayu.user.service.service.impl.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMessageService userMessageService;

    @GetMapping("/registry")
    public boolean userRegistry(@RequestParam("userName") String userName){
        return userService.rigstry(userName);
    }

    @GetMapping("/sendMessage")
    public boolean sendMessageToUser(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("content") String content){
        boolean result = userMessageService.sentMessageByFeign(phoneNumber, content);
        return result;
    }

}
