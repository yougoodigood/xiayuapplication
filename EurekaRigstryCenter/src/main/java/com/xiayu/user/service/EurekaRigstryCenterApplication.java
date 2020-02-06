package com.xiayu.user.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //springboot注解
@EnableEurekaServer //eureka 注册中心
public class EurekaRigstryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRigstryCenterApplication.class); //启动项目
    }
}
