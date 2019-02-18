package com.panion.space.cloud.eurekafeign.controller;

import com.panion.space.cloud.eurekafeign.feigninterface.HiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    HiInterface hiInterface;

    @RequestMapping("hi")
    public String hi(){
        return hiInterface.sayHiFromClientOne();
    }
}
