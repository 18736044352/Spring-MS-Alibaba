package com.java.controller;

import com.java.services.FirstServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class FirstConsumerController {


    private static final RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private FirstServiceStub firstServiceStub;


    @RequestMapping(value = "first", method = RequestMethod.GET)
    public String first() {

       String res = firstServiceStub.index();
        return restTemplate.getForObject("http://127.0.0.1:8081/provider/index" , String.class);
    }
}
