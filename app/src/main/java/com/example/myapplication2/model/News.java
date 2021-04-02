package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.INewsData;
import com.example.myapplication2.utils.NewsRetrofitUtils;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： News
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:57
 * 描述：TODO
 */
public class News implements IView.Icontent.INews {
    @Override
    public void setData(INewsData data, com.example.myapplication2.interfaces.INetWorkCollBack.News view) {
        NewsRetrofitUtils.getInstance().getNews(data.url(), data.mnc(), data.ch(), data.display(), data.nmnc(), data.app_lan(), data.pid(), data.mcc(), data.nmcc(), data.osv(), data.pf(), data.v(), data.appv(), data.lan(), data.action(), data.model(), data.net(), data.aid(), data.brand(), new INetWorkCollBack.News() {
            @Override
            public <A> void setNews(A a) {
                view.setNews(a);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
