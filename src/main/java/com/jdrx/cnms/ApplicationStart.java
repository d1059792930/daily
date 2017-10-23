package com.jdrx.cnms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wjm on 2017/5/5.
 */



@EnableAutoConfiguration
@ComponentScan(basePackages = "com.jdrx")
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
