package com.lzj.annotation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lzj.annotation.apt_annotation.BindView;
import com.lzj.annotation.butterknifetools.ButterKnife;

/**
 * 仿写ButterKnife注解框架
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_test)
    TextView tv_test;

    @BindView(R.id.tv_test2)
    TextView tv_test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //触发 bind() 方法一, 直接调用
        //MainActivityViewBinding.bind(this);
        //触发 bind() 方法二,  反射调用
        ButterKnife.bind(this);

        tv_test.setText("仿写注解框架");

        tv_test2.setText("仿写注解框架2");
    }
}
