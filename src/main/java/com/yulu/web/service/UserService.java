package com.yulu.web.service;

import com.yulu.web.entity.User;

import java.util.List;

/**
 * Created by Yulu on 2017/9/7.
 */
public interface UserService {

    User getUserById(Integer id);

    int insertUser(User user);

    List<User> getAllUser(User user);

    int deleteUserById(Integer id);
}
