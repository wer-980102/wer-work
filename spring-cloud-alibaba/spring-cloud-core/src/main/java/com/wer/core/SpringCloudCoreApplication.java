package com.wer.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCoreApplication.class, args);
    }

}
