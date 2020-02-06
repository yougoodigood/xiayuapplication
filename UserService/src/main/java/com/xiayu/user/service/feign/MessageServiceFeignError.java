package com.xiayu.user.service.feign;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceFeignError implements MessageServiceFeign {
    @Override
    public boolean sentMessage(String phoneNumber, String content) {
        System.out.println("send phoneNumber:"+phoneNumber + " content:" + content + "error !!!");
        return false;
    }
}
