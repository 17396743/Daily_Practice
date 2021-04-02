package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IRecommend_indexData;
import com.example.myapplication2.utils.Recommend_indexRetrofitUtils;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： Recommend_index
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class Recommend_index implements IView.IBooks.IRecommend_index {
    @Override
    public void setData(IRecommend_indexData data, com.example.myapplication2.interfaces.INetWorkCollBack.Recommend_index view) {
        Recommend_indexRetrofitUtils.getInstance().getRecommend_index(data.url(), data.app_channel(), data.terminal_model(), data.channel(), data._debug(), data.imei(), data.version(), data.mac(), data.androidId(), data.timestamp(), new INetWorkCollBack.Recommend_index() {
            @Override
            public <H> void setrecommend_index(H h) {
                view.setrecommend_index(h);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
