package com.example.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * EnableConfigServer：启用配置服务
 *
 * Author: 王俊超
 * Date: 2017-05-24 21:41
 * All Rights Reserved !!!
 */
@EnableConfigServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
