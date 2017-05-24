package com.example.spring.cloud.web;

import com.example.spring.cloud.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 王俊超
 * Date: 2017-05-24 07:14
 * All Rights Reserved !!!
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }
}
