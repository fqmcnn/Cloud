package com.panion.space.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String hi(){
        return "IP:" + port;
    }
}
