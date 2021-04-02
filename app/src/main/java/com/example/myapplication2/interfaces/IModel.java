package com.example.myapplication2.interfaces;

import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.interfaces
 * 文件名： IModel
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:00
 * 描述：TODO
 */
public interface IModel extends INetWorkCollBack {
    //选项栏内容
    interface INews {
        <A> void getNews(String url, String mnc, String ch, String display, String nmnc, String app_lan, String pid, String mcc, String nmcc, String osv, String pf, String v, String appv, String lan, String action, String model, String net, String aid, String brand, News view);
    }

    //文章
    interface ISubject {
        <B> void getSubject(String url, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, Subject view);
    }

    //我的订阅
    interface IBatchUpdate_One {
        <C> void getBatchUpdate_One(String url, String uid, String app_channel, String terminal_model, String category_id, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, BatchUpdate_One view);
    }

    //应用商店
    interface IRes {
        <D> void getRes(String url, Res view);
    }

    //读物推荐
    interface IRank {
        <E> void getRank(String url, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, Rank view);
    }

    //分类
    interface ICategory {
        <F> void getCategory(String url, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, Category view);
    }

    //最新内容
    interface ILatest {
        <G> void getLatest(String url, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, Latest view);
    }

    //推荐文章
    interface IRecommend_index {
        <H> void getRecommend_index(String url, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, Recommend_index view);
    }

    //猜你喜欢
    interface IBatchUpdate_Two {
        <I> void getBatchUpdate_Two(String url, String uid, String app_channel, String terminal_model, String channel, String _debug, String imei, String version, String mac, String androidId, String timestamp, BatchUpdate_Two view);
    }

    //最近节日
    interface IYear {
        <J> void getYear(String url, Year view);
    }
}
