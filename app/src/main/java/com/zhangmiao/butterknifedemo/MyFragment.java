package com.zhangmiao.butterknifedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zhangmiao.BindView;
import com.zhangmiao.OnClick;
import com.zhangmiao.bindviewapi.ViewInjector;

/**
 * Author: zhangmiao
 * Date: 2017/6/16
 */
public class MyFragment extends Fragment {

    @BindView(R.id.ok)
    Button ok;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_layout, container, false);
        ViewInjector.inject(this, view);
        return view;
    }

    //@OnClick(R.id.ok)
    public void clickOk() {
        Toast.makeText(getContext(), "clickOk", Toast.LENGTH_SHORT).show();
    }

}
