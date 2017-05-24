package com.example.spring.cloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: 王俊超
 * Date: 2017-05-24 07:42
 * All Rights Reserved !!!
 */
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
