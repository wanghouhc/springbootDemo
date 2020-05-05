package com.huangchuan.springmybatis.mapper;

import com.huangchuan.springmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:采用配置文件的操作数据库方式
 * User: HC
 * Date: 2020-05-02-17:11
 */
@Mapper
@Repository
public interface UserXmlMapper {

    public List<User> findAll();
}
