package com.xiayu.user.service.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiayu.user.service.feign.MessageServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserMessageService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MessageServiceFeign messageServiceFeign; //编译器报错

    @HystrixCommand(fallbackMethod = "sentMessageError")
    public boolean sentMessage(String phoneNumber, String content) {
//        String url = "http://CommonIntegration/mail/send?phoneNumber=" + phoneNumber + "&content=" +content;
        String url = "http://CommonIntegration/mail/send?phoneNumber=" + phoneNumber + "&content=" +content;
        Boolean result = restTemplate.getForObject(url, Boolean.class);
        return result;
    }

    public boolean sentMessageError(String phoneNumber,String content){
        System.out.println("phoneNumber:" +phoneNumber + " content:" + content + " send error");
        return false;
    }

    public boolean sentMessageByFeign(String phoneNumber,String content){
        boolean result = messageServiceFeign.sentMessage(phoneNumber, content);
        return result;
    }
}
