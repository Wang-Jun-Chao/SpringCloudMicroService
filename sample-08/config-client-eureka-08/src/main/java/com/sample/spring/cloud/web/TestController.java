package com.sample.spring.cloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 王俊超
 * Date: 2017-05-28 11:47
 * All Rights Reserved !!!
 */
@RefreshScope
@RestController
public class TestController {

    @Value("from")
    private String from;

    @RequestMapping(value = "/from")
    public String from() {
        return this.from;
    }
}
