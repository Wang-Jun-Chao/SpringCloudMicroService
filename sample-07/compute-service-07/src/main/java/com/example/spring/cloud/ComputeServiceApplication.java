package com.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * EnableEurekaClient 表明这是一个服务发现客户端，可以用于提供服务
 * Author: 王俊超
 * Date: 2017-05-23 21:17
 * All Rights Reserved !!!
 */
@EnableEurekaClient
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApplication.class, args);
    }
}
