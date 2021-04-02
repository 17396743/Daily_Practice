package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.ICategoryData;
import com.example.myapplication2.utils.CategoryRetrofitUtils;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： Category
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class Category implements IView.Icontent.ICategory {
    @Override
    public void setData(ICategoryData data, INetWorkCollBack.Category view) {
        CategoryRetrofitUtils.getInstance().getCategory(data.url(), data.app_channel(), data.terminal_model(), data.channel(), data._debug(), data.imei(), data.version(), data.mac(), data.androidId(), data.timestamp(), new com.example.myapplication2.utils.interfaces.INetWorkCollBack.Category() {
            @Override
            public <F> void setCategory(F f) {
                view.setCategory(f);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
