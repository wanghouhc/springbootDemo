package com.haungchuan.springbootlistener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-9:17
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner.....");
        System.out.println(Arrays.asList(args));

    }
}
