package com.zhangmiao.bindviewapi.finder;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class ActivityFinder implements Finder {

    @Override
    public Context getContext(Object source) {
        return (Activity) source;
    }

    @Override
    public View findView(Object source, int id) {
        return ((Activity) source).findViewById(id);
    }
}
