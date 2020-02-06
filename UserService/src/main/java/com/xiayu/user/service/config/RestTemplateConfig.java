package com.xiayu.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    //必须加入该注解，否则的话使用rabbon + restTemplate调用服务接口，
    // url会当做普通的url，一般会报类似springcloud java.net.UnknownHostException: COMMONINTEGRATION的错误
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
