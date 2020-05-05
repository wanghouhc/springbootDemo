package com.huangchuan.springbootcondition.config;

import com.huangchuan.springbootcondition.condition.ClassCondition;
import com.huangchuan.springbootcondition.condition.ConditionOnClass;
import com.huangchuan.springbootcondition.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-17:49
 */
@Configuration
public class UserConfig {

    @Bean
   // @Conditional(ClassCondition.class) //条件接口，当满足可condition中的条件，这个类才会被加载,
    //根据classcondition中的返回情况，来判断条件是否成立

    //@condition的注解版本
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }


    @Bean
    @ConditionalOnProperty(name="itcast",havingValue = "itheima")
    public User user2(){
        return new User();
    }
}
