package com.jdrx.cnms.interceptor;


import com.alibaba.fastjson.JSON;
import com.jdrx.cnms.bean.ResponseFactory;
import com.jdrx.cnms.bean.ResposeVO;
import com.jdrx.cnms.bean.entity.User;
import com.jdrx.cnms.util.Constants;
import com.jdrx.cnms.util.UserUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by dwz on 2017/5/31.
 * 登录拦截器
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String uri = request.getRequestURI();
        String method = uri.substring(uri.lastIndexOf("/")+1, uri.length());
        System.out.println("method--："+method);
        if (method.equals(Constants.LOGIN)||method.equals("captcha")) {
            return true;
        } else {
            String token = request.getParameter("dailyToken");
            User userInMap = UserUtil.userMap.get(token);
            System.out.println("token："+token);
            System.out.println("用户userInMap："+userInMap);
            if (userInMap != null) {
                return true;
            }
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            ResposeVO resposeVO = ResponseFactory.err("请先登录！");
            response.getWriter().write(JSON.toJSONString(resposeVO));
            return false;
        }
    }

}
