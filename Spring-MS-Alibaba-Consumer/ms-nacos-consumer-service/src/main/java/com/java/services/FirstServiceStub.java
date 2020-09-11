package com.java.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ms-nacos-provider")
public interface FirstServiceStub {

    @RequestMapping("/provider/index")
    public String index();
}
