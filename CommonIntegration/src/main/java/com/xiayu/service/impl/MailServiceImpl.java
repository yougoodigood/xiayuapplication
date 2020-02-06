package com.xiayu.service.impl;

import com.xiayu.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MailServiceImpl implements IMailService {

    @Override
    public boolean sendMain(String phoneNumber, String content) {
        System.out.println("phoneNumber:" + phoneNumber + " content:" +content);
        return true;
    }
}
