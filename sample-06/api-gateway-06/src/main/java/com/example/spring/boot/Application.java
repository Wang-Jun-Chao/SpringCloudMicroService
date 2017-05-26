package com.example.spring.boot;

import com.example.spring.boot.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Author: 王俊超
 * Date: 2017-05-26 07:45
 * All Rights Reserved !!!
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
