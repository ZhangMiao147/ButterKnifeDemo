package com.zhangmiao.bindviewapi.finder;

import android.content.Context;
import android.view.View;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class ViewFinder implements Finder {

    @Override
    public Context getContext(Object source) {
        return ((View) source).getContext();
    }

    @Override
    public View findView(Object source, int id) {
        return ((View) source).findViewById(id);
    }
}
