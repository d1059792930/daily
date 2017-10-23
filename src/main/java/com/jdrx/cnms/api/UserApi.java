package com.jdrx.cnms.api;

import com.jdrx.cnms.bean.ResponseFactory;
import com.jdrx.cnms.bean.ResposeVO;
import com.jdrx.cnms.bean.dto.LoginDTO;
import com.jdrx.cnms.bean.entity.User;
import com.jdrx.cnms.service.UserService;
import com.jdrx.cnms.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.UUID;

/**
 * Created by dwz on 2017/5/31.
 */
@RestController
@RequestMapping(value = "/api/0/user")
//解决跨域问题
@CrossOrigin
public class UserApi {
    @Autowired
    private UserService userService;

    @RequestMapping(value="login", method= RequestMethod.POST)
    @ResponseBody
    public ResposeVO login(@RequestBody @Valid LoginDTO loginDTO, HttpServletRequest request) throws Exception {
        User user = userService.selectUser(loginDTO);
        if (null==user){
            return ResponseFactory.err("用户名或密码错误！");
        }
        if (user.getDelFlag().equals(Constants.IS_DELETE)){
            return ResponseFactory.err("用户不存在！");
        }
        user.setPassword("");
        //解决不在相同session问题,把token放入内存中。
        String token="cnms-"+new Date().getTime()+ UUID.randomUUID().toString();
        System.out.println("========dailyToken：====="+token);
        user.setDailyToken(token);
        UserUtil.userMap.put(token,user);
        ResposeVO resposeVO = ResponseFactory.ok(user);
        return resposeVO;
    }

    @RequestMapping(value="logout", method= RequestMethod.POST)
    @ResponseBody
    public ResposeVO logout(HttpServletRequest request, String token) throws Exception {
        User userInSession = (User)request.getSession().getAttribute(Constants.USER_IN_SESSION);
        if(null!=userInSession){
            //清除内存
            UserUtil.userMap.remove(token);
            //清楚session
            request.getSession().removeAttribute(Constants.USER_IN_SESSION);
        }
        ResposeVO resposeVO = ResponseFactory.ok("退出成功");
        return resposeVO;
    }
}
