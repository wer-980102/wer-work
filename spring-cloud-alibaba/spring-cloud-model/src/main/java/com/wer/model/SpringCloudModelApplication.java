package com.wer.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudModelApplication.class, args);
    }

}
