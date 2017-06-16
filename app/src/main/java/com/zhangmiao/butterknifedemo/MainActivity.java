package com.zhangmiao.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zhangmiao.BindView;
import com.zhangmiao.bindviewapi.ViewInjector;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.inject(this);
        mTextView.setText("11111111");
    }
}
