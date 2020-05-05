package com.huangchuan.redis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-0:14
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class) //获取配置类
@ConditionalOnClass(Jedis.class)  //当spring容器里面存在这个bean的时候，放行
public class RedisAutoConfig {

    //提供jedis的bean
    @Bean
    @ConditionalOnMissingBean(name="jedis") //当springIOC中不存在jedis(没有引入redis依赖）时，使用用户自定义
    public Jedis jedis(RedisProperties redisProperties) {
        System.out.println("redisconfig.....");
        return new Jedis(redisProperties.getHost(), redisProperties.getPort());
    }
}
