package com.example.myapplication2.adapter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.adapter
 * 文件名： BeanActivity
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 18:15
 * 描述：TODO
 */
public abstract class BeanActivity<T> extends AppCompatActivity {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if (presenter!= null){
            presenter = getData();
        }
        initView();
        initData();
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract int getLayoutId();

    protected abstract T getData();
}
