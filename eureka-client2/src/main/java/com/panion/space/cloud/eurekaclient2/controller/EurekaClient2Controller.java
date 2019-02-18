package com.panion.space.cloud.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClient2Controller {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String eurekaClient2(){
        return "IP:" + port;
    }
}
