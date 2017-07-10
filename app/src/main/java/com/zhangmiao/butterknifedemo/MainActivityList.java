package com.zhangmiao.butterknifedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.zhangmiao.BindLayout;
import com.zhangmiao.BindView;
import com.zhangmiao.bindviewapi.ViewInjector;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
@BindLayout(R.layout.activity_main_activity_list)
public class MainActivityList extends AppCompatActivity {

    @BindView(R.id.id_listview)
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewInjector.inject(this);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add("ViewInjector--" + i);
        }

        MyAdapter myAdapter = new MyAdapter(this, list);
        listView.setAdapter(myAdapter);
    }
}
