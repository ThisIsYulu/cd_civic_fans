package com.yulu.web.controller;

import com.yulu.web.entity.User;
import com.yulu.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Yulu on 2017/9/5.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(@RequestParam Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.GET)
    @ResponseBody
    public int insertUser(@RequestParam String name, @RequestParam Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return userService.insertUser(user);
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        User user = new User();
        user.setPageNum(pageNum);
        user.setPageSize(pageSize);
        List<User> allUser = userService.getAllUser(user);
        return allUser;
    }

    @RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserById(@RequestParam Integer id) {
        return userService.deleteUserById(id);
    }
}
