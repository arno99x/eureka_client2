package com.springcloud.eureka_client2.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        System.out.println("call login interface ...");
        return "success";
    }
}
