package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IYearData;
import com.example.myapplication2.utils.YearRetrofitFUtils;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： Year
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:59
 * 描述：TODO
 */
public class Year implements IView.IDays.IYear {
    @Override
    public void setData(IYearData data, com.example.myapplication2.interfaces.INetWorkCollBack.Year view) {
        YearRetrofitFUtils.getInstance().getYear(data.url(), new INetWorkCollBack.Year() {
            @Override
            public <J> void setyear(J j) {
                view.setyear(j);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
