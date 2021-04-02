package com.example.myapplication2.presenter;

import com.example.myapplication2.interfaces.IPresenter;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IRecommend_indexData;
import com.example.myapplication2.model.Recommend_index;
import com.example.myapplication2.utils.api.URLContrat;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.presenter
 * 文件名： IBooksPresenter
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:45
 * 描述：TODO
 */
public class IBooksPresenter implements IPresenter.IData {
    private IView.IBooks.IRecommend_index recommend_index;
    private IView.IBooks books;

    public IBooksPresenter(IView.IBooks books) {
        this.recommend_index = new Recommend_index();
        this.books = books;
    }

    @Override
    public void getData() {
        recommend_index.setData(new IRecommend_indexData() {
            @Override
            public String url() {
                return URLContrat.NEWRecommend_indexURL;
            }

            @Override
            public String app_channel() {
                return URLContrat.Recommend_index_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.Recommend_index_app_terminal_model;
            }

            @Override
            public String channel() {
                return URLContrat.Recommend_index_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.Recommend_index__debug;
            }

            @Override
            public String imei() {
                return URLContrat.Recommend_index_imei;
            }

            @Override
            public String version() {
                return URLContrat.Recommend_index_version;
            }

            @Override
            public String mac() {
                return URLContrat.Recommend_index_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.Recommend_index_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.Recommend_index_timestamp;
            }
        }, new IView.IBooks() {
            @Override
            public <H> void setrecommend_index(H h) {
                books.setrecommend_index(h);
            }

            @Override
            public void setError(String error) {
                books.setError(error);
            }
        });
    }
}
