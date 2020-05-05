package com.huangchuan.test;

import com.huangchuan.springjunit.SpringJunitApplication;
import com.huangchuan.springjunit.service.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-16:08
 */
@SpringBootTest(classes = SpringJunitApplication.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserTest usertest;

    @Test
    public void test(){
        usertest.add();
    }
}
