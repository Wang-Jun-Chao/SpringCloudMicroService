package com.example.spring.boot.web;

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
 * Date: 2017-05-26 07:34
 * All Rights Reserved !!!
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    @Qualifier("discoveryClient")
    private DiscoveryClient client;

    @Autowired
    private Registration registration;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;

        if (client != null && registration != null) {
            List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
            for (ServiceInstance ins : instances) {
                logger.info("/add, host:" + ins.getHost() + ", service_id:" + ins.getServiceId() + ", result:" + r);
            }
        }

        return "From Service-B, Result is " + r;
    }
}
