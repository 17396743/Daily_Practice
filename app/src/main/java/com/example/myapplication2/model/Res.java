package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IResData;
import com.example.myapplication2.utils.ResRetrofitUtils;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： Res
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class Res implements IView.IPackages.IRes {
    @Override
    public void setData(IResData data, com.example.myapplication2.interfaces.INetWorkCollBack.Res view) {
        ResRetrofitUtils.getInstance().getRes(data.url(), new INetWorkCollBack.Res() {
            @Override
            public <D> void setbatchUpdate_One(D d) {
                view.setbatchUpdate_One(d);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
