package com.example.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: 王俊超
 * Date: 2017-05-26 07:34
 * All Rights Reserved !!!
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApplication.class, args);
    }
}
