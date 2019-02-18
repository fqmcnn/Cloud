package com.panion.space.cloud.eurekafeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-hi")
public interface HiInterface {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
