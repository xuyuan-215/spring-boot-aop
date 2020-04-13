package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xuyuan
 * @Date 2020/4/13 15:22
 * @Version 1.0
 */
@RestController
@Slf4j

public class UserController {
    @GetMapping("hello")
   public  String hello(String name){
       log.info("hello()方法无须鉴权，也不用认证，当前用户名："+name);
       return  "hello方法访问成功";
   }

    /**
     * 需要登录效验
     * @param name
     * @return
     */
    @GetMapping("user")
   public  String user(String name){
        log.info("user()用认证，当前用户名："+name);
        return  "user()方法访问成功";
   }
   @GetMapping("admin")
   @AuthToken(role_name={"admin",})
   public  String  admin(String name){
       log.info("admin()方法无须鉴权，也不用认证，当前用户名："+name);
        return  "admin()方法访问成功";
   }






}
