package com.yulu.web.domain;

import com.yulu.web.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Yulu on 2017/9/7.
 */
@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper<User>, tk.mybatis.mapper.common.MySqlMapper<User> {
}
