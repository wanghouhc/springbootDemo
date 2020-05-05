package com.huangchuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-12:55
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
