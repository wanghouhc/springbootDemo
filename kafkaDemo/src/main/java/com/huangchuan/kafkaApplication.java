package com.huangchuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Description:
 * User: HC
 * Date: 2020-05-05-18:27
 */
@SpringBootApplication
public class kafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(kafkaApplication.class,args);
    }

}
