package com.xiayu.user.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CommonIntegration",fallback = MessageServiceFeignError.class)
public interface MessageServiceFeign {
    @GetMapping("/mail/send")
    boolean sentMessage(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("content") String content);
}