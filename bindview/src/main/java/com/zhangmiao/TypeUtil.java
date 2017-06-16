package com.zhangmiao;

import com.squareup.javapoet.ClassName;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class TypeUtil {
    public static final ClassName FINDER = ClassName.get("com.zhangmiao.bindviewapi.finder","Finder");
    public static final ClassName ANDROID_ON_CLICK_LISTENER = ClassName.get("android.view", "View", "OnClickListener");
    public static final ClassName ANDROID_VIEW = ClassName.get("android.view", "View");
    public static final ClassName JINJECTOR = ClassName.get("com.zhangmiao.bindviewapi", "Injector");
}
