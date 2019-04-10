package com.lzj.annotation.apt_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lzj on 2019/4/3
 * Describe ：自定义注解
 */
@Retention(RetentionPolicy.CLASS)  //表示运行时注解
@Target(ElementType.FIELD) //表示注解范围为类成员
public @interface BindView {

    int value() default -1;

}
