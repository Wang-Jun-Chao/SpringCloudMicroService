package com.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EnableEurekaServer 启动一个服务注册中心提供给其他应用进行使用
 * SpringBootApplication 启动SpringBoot应用程序
 * Author: 王俊超
 * Date: 2017-05-23 08:22
 * All Rights Reserved !!!
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
