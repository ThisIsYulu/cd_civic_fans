package com.yulu.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.yulu.web.domain.UserDao;
import com.yulu.web.entity.User;
import com.yulu.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yulu on 2017/9/7.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertSelective(user);
    }

    @Override
    public List<User> getAllUser(User user) {
        // 只有紧跟在 PageHelper.startPage 方法后的第一个 MyBatis 的查询(select)方法会被分页。
        PageHelper.startPage(user.getPageNum(), user.getPageSize());
        return userDao.selectAll();
    }

    @Override
    public int deleteUserById(Integer id) {
        User user = new User();
        user.setId(id);
        return userDao.deleteByPrimaryKey(user);
    }
}
