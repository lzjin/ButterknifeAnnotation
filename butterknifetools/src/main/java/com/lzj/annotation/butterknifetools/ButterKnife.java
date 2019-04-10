package com.lzj.annotation.butterknifetools;

import android.app.Activity;

import java.lang.reflect.Method;

/**
 * Created by lzj on 2019/4/3
 * Describe ：利用反射来 调用BindViewProcessor创建的xxxActivity_ViewBinding.java中的方法
 */
public class ButterKnife {

    public static void bind(Activity activity) {
        Class clazz = activity.getClass();
        try {
            Class bindViewClass = Class.forName(clazz.getName() + "ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
