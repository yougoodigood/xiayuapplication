package com.xiayu.common.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonIntegrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonIntegrationApplication.class);
    }
}
