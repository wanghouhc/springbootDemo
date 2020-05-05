package com.huanghcuan.springredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-16:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testset(){
        redisTemplate.boundValueOps("name").set("zhangshan");
    }

    @Test
    public void testget(){
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
        redisTemplate.opsForValue();
    }
}
