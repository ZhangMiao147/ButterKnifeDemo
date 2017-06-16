package com.zhangmiao.bindviewapi;

import com.zhangmiao.bindviewapi.finder.Finder;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public interface Injector<T> {
    void inject(T host, Object source, Finder finder);
}
