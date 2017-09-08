package com.yulu.web.config.entity;

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by Yulu on 2017/9/7.
 */
public class BaseEntity {

    @Id
    private Integer id;
    @Transient
    private Integer pageNum = 1;
    @Transient
    private Integer pageSize = 10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
