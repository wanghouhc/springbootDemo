package com.huangchuan.springproperties.controller;

import com.huangchuan.springproperties.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-13:08
 */
@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Value("${address[0]}") //这里不能直接全部取出输出
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Person person;
    @Autowired
    private Environment env;
    @RequestMapping("/hello")
    public String sayHello(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        int serverPort = request.getServerPort();
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("msg2"));
        return serverPort+": Hello World3!"+'\n'
                +"person: "+name+'\n'
                +"address: "+address+'\n'
                +"msg1: "+msg1+'\n'
                +"msg2: "+msg2;
    }

    @RequestMapping("person")
    public void confTest(){
        System.out.println(person);
    }
}
