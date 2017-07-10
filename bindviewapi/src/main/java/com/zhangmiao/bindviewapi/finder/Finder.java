package com.zhangmiao.bindviewapi.finder;

import android.content.Context;
import android.view.View;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public interface Finder {
    Context getContext(Object source);

    View findView(Object source, int id);
}
