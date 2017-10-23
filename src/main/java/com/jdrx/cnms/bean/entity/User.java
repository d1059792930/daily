package com.jdrx.cnms.bean.entity;


import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.UUID;

/**
 * 系统用户
 */
public class User implements BaseEntity{
    private String id;

    private String loginName;//登录名

    private String password;//密码

    private String name;//用户名

    private String email;//邮箱

    private String phone;//联系电话

    private String createBy;//创建人

    private Date createDate;//创建时间

    private String updateBy;//谁修改

    private Date updateDate;//修改时间

    private String delFlag;//逻辑删除

    private String isAdmin;//是否是超级管理员

    private String dailyToken;//用户登录

    public String getDailyToken() {
        return dailyToken;
    }

    public void setDailyToken(String dailyToken) {
        this.dailyToken = dailyToken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    @Override
    public boolean isNewReord() {
        return StringUtils.isEmpty(this.id);
    }

    @Override
    public void preInsert() {
        this.id= UUID.randomUUID().toString();
        this.createBy="";
        this.createDate = new Date();
        this.updateDate = this.createDate;
    }

    @Override
    public void preUpdate() {
        this.updateDate = new Date();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", delFlag='" + delFlag + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                ", dailyToken='" + dailyToken + '\'' +
                '}';
    }
}