package com.zhangmiao.butterknifedemo;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class MyAdapter extends ArrayAdapter<String>{

    public MyAdapter(Context context, List<String> objects) {
        super(context, -1, objects);
    }



}
