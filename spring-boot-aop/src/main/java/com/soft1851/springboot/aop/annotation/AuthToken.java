package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @Author xuyuan
 * @Date 2020/4/13 15:33
 * @Version 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {
    /**
     * 访问角色默认为空
     * @return
     */
    String[] role_name() default "";

}
