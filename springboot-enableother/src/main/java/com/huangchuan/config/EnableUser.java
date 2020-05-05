package com.huangchuan.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-23:00
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({UserConfig.class})
public @interface EnableUser {
}
