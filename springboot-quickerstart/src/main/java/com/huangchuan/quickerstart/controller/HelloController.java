package com.huangchuan.quickerstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-13:00
 */
@RestController
public class HelloController {
    @RequestMapping("/Hello")
    public String sayHello(){
        return "Hello World!";
    }
}
