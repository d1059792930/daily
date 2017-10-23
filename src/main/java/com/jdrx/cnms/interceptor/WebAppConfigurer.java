package com.jdrx.cnms.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springMVC拦截配置
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {
    @Autowired
    LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截api下的资源
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/api/**");
        super.addInterceptors(registry);
    }

}