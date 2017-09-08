package com.yulu.web.config.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Yulu on 2017/9/7.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
