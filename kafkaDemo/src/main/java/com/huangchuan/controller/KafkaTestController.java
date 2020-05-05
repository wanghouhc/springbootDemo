package com.huangchuan.controller;

import com.huangchuan.producer.KfkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: HC
 * Date: 2020-05-05-18:21
 */
@RestController
public class KafkaTestController {

    @Autowired
    private KfkaProducer producer;
    @RequestMapping("/testSendMsg")
    public String testSendMsg(){
        producer.send();
        return "success";
    }
}
