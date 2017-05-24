package com.example.spring.boot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RefreshScope：运行其间会刷新
 *
 * Author: 王俊超
 * Date: 2017-05-24 21:37
 * All Rights Reserved !!!
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    @RequestMapping(value = "/from")
    public String from() {
        return  this.from;
    }
}
