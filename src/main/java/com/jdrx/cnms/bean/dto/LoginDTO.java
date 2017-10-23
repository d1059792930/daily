package com.jdrx.cnms.bean.dto;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by dwz on 2017/5/31.
 */
public class LoginDTO {
    @NotBlank
    private String loginName;
    @NotBlank
    private String password;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

