package com.example.spring.cloud.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2017-05-23 21:16
 * All Rights Reserved !!!
 */
@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private Registration registration;

    @Autowired
    @Qualifier("discoveryClient")
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {

        if (registration != null && client != null) {
            List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
            System.out.println("[serviceId=" + registration.getServiceId() + ", instances=" + instances + "]");
        }

        return a + b;
    }
}
