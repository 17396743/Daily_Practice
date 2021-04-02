package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IBatchUpdate_TwoData;
import com.example.myapplication2.utils.BatchUpdate_TwoRetrofitUtils;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： BatchUpdate_Two
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class BatchUpdate_Two implements IView.Icontent.IBatchUpdate_Two {

    @Override
    public void setData(IBatchUpdate_TwoData data, INetWorkCollBack.BatchUpdate_Two view) {
        BatchUpdate_TwoRetrofitUtils.getInstance().getBatchUpdate_Two(data.url(), data.uid(), data.app_channel(), data.terminal_model(), data.channel(), data._debug(), data.imei(), data.version(), data.mac(), data.androidId(), data.timestamp(), new com.example.myapplication2.utils.interfaces.INetWorkCollBack.BatchUpdate_Two() {
            @Override
            public <I> void setBatchUpdate_Two(I i) {
                view.setBatchUpdate_Two(i);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
