package com.zhangmiao.bindviewapi;

import android.app.Activity;
import android.view.View;

import com.zhangmiao.bindviewapi.finder.ActivityFinder;
import com.zhangmiao.bindviewapi.finder.Finder;
import com.zhangmiao.bindviewapi.finder.ViewFinder;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class ViewInjector {

    private static final ActivityFinder ACTIVITY_FINDER = new ActivityFinder();
    private static final ViewFinder VIEW_FINDER = new ViewFinder();
    private static final Map<String, Injector> FINDER_MAP = new HashMap<>();

    public static void inject(Activity activity) {
        inject(activity, activity, ACTIVITY_FINDER);
    }

    public static void inject(View view) {
        inject(view, view);
    }

    public static void inject(Object host, View view) {
        inject(host, view, VIEW_FINDER);
    }

    public static void inject(Object host, Object source, Finder finder) {
        String className = host.getClass().getName();
        try {
            Injector injector = FINDER_MAP.get(className);
            if (injector == null) {
                Class<?> finderClass = Class.forName(className + "$$Injector");
                injector = (Injector) finderClass.newInstance();
                FINDER_MAP.put(className, injector);
            }
            injector.inject(host, source, finder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to inject for " + className, e);
        }
    }


}
