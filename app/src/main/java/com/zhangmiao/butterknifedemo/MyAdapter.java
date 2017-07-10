package com.zhangmiao.butterknifedemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zhangmiao.BindView;
import com.zhangmiao.bindviewapi.ViewInjector;

import java.util.List;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, List<String> objects) {
        super(context, -1, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        return super.getView(position, convertView, parent);
    }

    public static final class ViewHolder {
        @BindView(R.id.id_tv)
        TextView textView;

        public ViewHolder(View convertView) {
            ViewInjector.inject(this, convertView);
        }

    }

}
