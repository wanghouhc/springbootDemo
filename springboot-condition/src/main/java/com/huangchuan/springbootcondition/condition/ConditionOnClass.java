package com.huangchuan.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-18:23
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented  //这三个注解是创建注解需要的
@Conditional(ClassCondition.class)  //使用注解版本，将这个条件加到自己的注解上,则说明这个注解继承了功能
public @interface ConditionOnClass {
    String[] value();
}
