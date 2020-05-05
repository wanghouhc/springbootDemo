package com.huangchuan.springbootdeploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-13:04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
    public String findAll() {
        return "success";
    }
}
