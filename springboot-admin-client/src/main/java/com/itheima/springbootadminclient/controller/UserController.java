package com.itheima.springbootadminclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-11:58
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("findAll")
    public void findAll(){
        System.out.println("findAll");
    }
}
