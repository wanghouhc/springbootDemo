package com.huangchuan.config;

import com.huangchuan.pojo.Role;
import com.huangchuan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-22:52
 */
@Configuration
public class UserConfig {

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public Role roel(){
        return new Role();
    }
}
