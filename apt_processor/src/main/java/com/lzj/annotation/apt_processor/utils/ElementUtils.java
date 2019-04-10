package com.lzj.annotation.apt_processor.utils;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * Created by lzj on 2019/4/3
 * Describe ：注释
 */
public class ElementUtils {
    //获取包名
    public static String getPackageName(Elements elementUtils, TypeElement typeElement) {
        return elementUtils.getPackageOf(typeElement).getQualifiedName().toString();
    }

    //获取顶层类类名
    public static String getEnclosingClassName(TypeElement typeElement) {
        return typeElement.getSimpleName().toString();
    }

    //获取静态内部类类名
    public static String getStaticClassName(TypeElement typeElement) {
        return getEnclosingClassName(typeElement) + "Holder";
    }
}
