package com.xiayu.user.service.service.impl;

import com.xiayu.user.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

//    @Autowired
//    private UserMapper userMapper; //假设存在mapper

    @Autowired
    private UserMessageService messageService;

    @Override
    public boolean rigstry(String userName) {
//        userMapper.getUserByName(userName);
        return messageService.sentMessage("15301969209","注册成功");
    }
}
