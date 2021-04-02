package com.example.myapplication2.presenter;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IPresenter;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IResData;
import com.example.myapplication2.model.Res;
import com.example.myapplication2.utils.api.URLContrat;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.presenter
 * 文件名： IPackagesPresenter
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:50
 * 描述：TODO
 */
public class IPackagesPresenter implements IPresenter.IData {
    private IView.IPackages.IRes res;
    private IView.IPackages packages;

    public IPackagesPresenter(IView.IPackages packages) {
        this.res = new Res();
        this.packages = packages;
    }

    @Override
    public void getData() {
        res.setData(new IResData() {
            @Override
            public String url() {
                return URLContrat.NEWResURL;
            }
        }, new INetWorkCollBack.Res() {
            @Override
            public <D> void setbatchUpdate_One(D d) {
                packages.setbatchUpdate_One(d);
            }

            @Override
            public void setError(String error) {
                packages.setError(error);
            }
        });
    }
}
