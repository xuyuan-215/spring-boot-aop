package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @Author xuyuan
 * @Date 2020/4/9 15:26
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    /**
     *调用接口名称
     * @return
     */
    String name();


    /**
     * 标志该日志是否需要持久化储存
     * @return
     */
    boolean isSaved() default  false;
}
