package com.huangchuan.springmybatis.mapper;

import com.huangchuan.springmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 * User: HC
 * Date: 2020-05-02-16:54
 */
@Mapper
public interface userMapper {

    @Select("select * from tableName")
    public List<User> findAll();
}
