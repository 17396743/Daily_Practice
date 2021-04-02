package com.example.myapplication2.presenter;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IPresenter;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IYearData;
import com.example.myapplication2.model.Year;
import com.example.myapplication2.utils.api.URLContrat;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.presenter
 * 文件名： IDaysPresenter
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:49
 * 描述：TODO
 */
public class IDaysPresenter implements IPresenter.IData {
    private IView.IDays.IYear year;
    private IView.IDays days;

    public IDaysPresenter(IView.IDays days) {
        this.year = new Year();
        this.days = days;
    }

    @Override
    public void getData() {
        year.setData(new IYearData() {
            @Override
            public String url() {
                return URLContrat.NEWYearURL;
            }
        }, new INetWorkCollBack.Year() {
            @Override
            public <J> void setyear(J j) {
                days.setyear(j);
            }

            @Override
            public void setError(String error) {
                days.setError(error);
            }
        });
    }
}
