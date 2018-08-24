package com.yulu.cdcivicfans.config.entity;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by Yulu on 2017/9/7.
 */
public class BaseEntity {

    @Id
    private Integer id;
    private Date crtOn;
    private Date updOn;
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

    public Date getCrtOn() {
        return crtOn;
    }

    public void setCrtOn(Date crtOn) {
        this.crtOn = crtOn;
    }

    public Date getUpdOn() {
        return updOn;
    }

    public void setUpdOn(Date updOn) {
        this.updOn = updOn;
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
