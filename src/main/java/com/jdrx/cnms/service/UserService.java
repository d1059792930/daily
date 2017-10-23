package com.jdrx.cnms.service;

import com.jdrx.cnms.bean.dto.LoginDTO;
import com.jdrx.cnms.bean.dto.UserDTO;
import com.jdrx.cnms.bean.dto.UserQueryDTO;
import com.jdrx.cnms.bean.entity.User;
import com.jdrx.cnms.dao.UserMapper;
import com.jdrx.cnms.util.Constants;
import com.jdrx.cnms.util.MD5;
import com.jdrx.cnms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 基础用户
 * Created by dwz on 2017/5/31.
 */
@Service
public class UserService extends CrudService<UserMapper, User> {
    @Autowired
    UserMapper userMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 根据用户名和密码查询用户
     *
     * @param loginDTO
     * @return
     */
    public User selectUser(LoginDTO loginDTO) {
        String encodePWD = MD5.GetMD5Code(loginDTO.getPassword());
        //加密再查询
        loginDTO.setPassword(encodePWD);
        return userMapper.selectUser(loginDTO);
    }

    /**
     * 逻辑删除
     *
     * @param id
     */
    @Transactional(readOnly = false)
    public void deleteByID(String id) {
        try {
            User user = new User();
            user.setId(id);
            user.setDelFlag(Constants.IS_DELETE);
            userMapper.deleteByUser(user);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }

    ;

    /**
     * 获取用户分页
     *
     * @param user
     * @param page
     * @return
     */
    public Page<Map<String, Object>> getPage(UserQueryDTO user, Page<Map<String, Object>> page) {
        StringBuffer sql = new StringBuffer(" select id,login_name,name,email,phone,create_date,create_by,update_date,update_by from sys_user where 1=1 and del_flag=0");
        StringBuffer countSql = new StringBuffer(" select count(1) from sys_user where 1=1 and del_flag=0");
        if (!StringUtils.isEmpty(user.getLoginName())) {
            sql.append(" and login_name like '%" + user.getLoginName() + "%'");
            countSql.append(" and login_name like '%" + user.getLoginName() + "%'");
        }
        if (!StringUtils.isEmpty(user.getName())) {
            sql.append(" and name like '%" + user.getName() + "%'");
            countSql.append(" and name like '%" + user.getName() + "%'");
        }
        if (!StringUtils.isEmpty(user.getEmail())) {
            sql.append(" and email like '%" + user.getEmail() + "%'");
            countSql.append(" and email like '%" + user.getEmail() + "%'");
        }
        if (!StringUtils.isEmpty(user.getPhone())) {
            sql.append(" and phone like '%" + user.getPhone() + "%'");
            countSql.append(" and phone like '%" + user.getPhone() + "%'");
        }
        if (!StringUtils.isEmpty(user.getStartTime())) {
            sql.append(" and create_date > '" + user.getStartTime() + "'");
            countSql.append(" and create_date > '" + user.getStartTime() + "'");
        }
        if (!StringUtils.isEmpty(user.getEndTime())) {
            sql.append(" and create_date < '" + user.getEndTime() + "'");
            countSql.append(" and create_date < '" + user.getEndTime() + "'");
        }
        String limit = " limit " + (page.getPageNo() - 1) * page.getPageSize() + "," + page.getPageSize();
        sql.append(limit);
        //先设置count，再设置list
        int count = jdbcTemplate.queryForObject(countSql.toString(), Integer.class);
        page.setCount(count);

        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql.toString());
        page.setList(list);
        return page;
    }
}
