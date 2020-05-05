package com.huangchuan.springproperties.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-14:02
 */
@Component
@ConfigurationProperties(prefix = "person") //在这里指定前缀，就会从符合前缀的地方找，没加就直接在配置文件里面找对应的数据
public class Person {
    private String name;
    private Integer age;
    private String[] address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + Arrays.toString(address) +
                '}';
    }
}
