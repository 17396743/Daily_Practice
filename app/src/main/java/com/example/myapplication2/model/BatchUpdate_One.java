package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IBatchUpdate_OneData;
import com.example.myapplication2.utils.BatchUpdate_OneRetrofitUtils;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： BatchUpdate_One
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class BatchUpdate_One implements IView.Icontent.IBatchUpdate_One {
    @Override
    public void setData(IBatchUpdate_OneData data, INetWorkCollBack.BatchUpdate_One view) {
        BatchUpdate_OneRetrofitUtils.getInstance().getBatchUpdate_One(data.url(), data.uid(), data.app_channel(), data.terminal_model(), data.category_id(), data.channel(), data._debug(), data.imei(), data.version(), data.mac(), data.androidId(), data.timestamp(), new com.example.myapplication2.utils.interfaces.INetWorkCollBack.BatchUpdate_One() {
            @Override
            public <C> void setBatchUpdate_One(C c) {
                view.setBatchUpdate_One(c);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
