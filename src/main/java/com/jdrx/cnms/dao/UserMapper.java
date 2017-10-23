package com.jdrx.cnms.dao;

import com.jdrx.cnms.bean.dto.LoginDTO;
import com.jdrx.cnms.bean.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseDao<User> {
    /*
        根据用户查询
     */
    User selectUser(LoginDTO userDTO);

    void deleteByUser(User user);
}