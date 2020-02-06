package com.xiayu.integration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("CommonIntegration")
public interface MessageServiceFeign {
    @GetMapping("/mail/send")
    boolean sentMessage(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("content") String content);
}
