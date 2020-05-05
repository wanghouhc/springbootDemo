package com.huangchuan.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 * User: HC
 * Date: 2020-05-03-0:18
 */
//获取对应的参数
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host="localhost";
    private int port=6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
