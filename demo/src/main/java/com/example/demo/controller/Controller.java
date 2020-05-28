package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("hello")
    public String hello(String name){
        return name + "，<font color='red'>您好</font>";
    }

}
