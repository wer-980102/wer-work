package com.wer.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCommonApplication.class, args);
    }

}
