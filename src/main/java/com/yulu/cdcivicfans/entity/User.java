package com.yulu.cdcivicfans.entity;

import com.yulu.cdcivicfans.config.entity.BaseEntity;

/**
 * Created by Yulu on 2017/9/7.
 */
public class User extends BaseEntity {

    private String name;
    private Integer age;

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
}
