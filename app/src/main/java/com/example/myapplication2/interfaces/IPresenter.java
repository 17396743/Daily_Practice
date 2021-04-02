package com.example.myapplication2.interfaces;

import com.example.myapplication2.interfaces.data.IGetDataContrat;
import com.example.myapplication2.presenter.IContentPresenter;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.interfaces
 * 文件名： IPresenter
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:00
 * 描述：TODO
 */
public interface IPresenter {
    interface IData {
        void getData();
    }
    interface GetDataContrat extends IGetDataContrat {
        IContentPresenter getData();
    }
}
