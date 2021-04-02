package com.example.myapplication2.utils.api;

import com.example.myapplication2.model.data.BatchUpdate_OneBean;
import com.example.myapplication2.model.data.BatchUpdate_TwoBean;
import com.example.myapplication2.model.data.CategoryBean;
import com.example.myapplication2.model.data.LatestBean;
import com.example.myapplication2.model.data.NewsBean;
import com.example.myapplication2.model.data.RankBean;
import com.example.myapplication2.model.data.Recommend_indexBean;
import com.example.myapplication2.model.data.ResBean;
import com.example.myapplication2.model.data.SubjectBean;
import com.example.myapplication2.model.data.YearBean;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.utils
 * 文件名： ApiServer
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 18:17
 * 描述：TODO
 */
public interface ApiServer {
    //选项栏内容

    @GET
    Observable<NewsBean> getnews(@Url() String url, @Query("mnc") String mnc, @Query("ch") String ch, @Query("display") String display, @Query("nmnc") String nmnc, @Query("app_lan") String app_lan, @Query("pid") String pid, @Query("mcc") String mcc, @Query("nmcc") String nmcc, @Query("osv") String osv, @Query("pf") String pf, @Query("v") String v, @Query("appv") String appv, @Query("lan") String lan, @Query("action") String action, @Query("model") String model, @Query("net") String net, @Query("aid") String aid, @Query("brand") String brand);

    //文章
    @GET
    Observable<List<SubjectBean>> getsubject(@Url() String url, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //我的订阅
    @GET
    Observable<BatchUpdate_OneBean> getbatchUpdate_One(@Url() String url, @Query("uid") String uid, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("category_id") String category_id, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //应用商店
    @GET
    Observable<ResBean> getres(@Url() String url);

    //读物推荐
    @GET
    Observable<List<RankBean>> getrank(@Url() String url, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //分类
    @GET
    Observable<List<CategoryBean>> getcategory(@Url() String url, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //最新内容
    @GET
    Observable<List<LatestBean>> getlatest(@Url() String url, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //推荐文章
    @GET
    Observable<List<Recommend_indexBean>> getrecommend_index(@Url() String url, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //猜你喜欢
    @GET
    Observable<BatchUpdate_TwoBean> getbatchUpdate_Two(@Url() String url, @Query("uid") String uid, @Query("app_channel") String app_channel, @Query("terminal_model") String terminal_model, @Query("channel") String channel, @Query("_debug") String _debug, @Query("imei") String imei, @Query("version") String version, @Query("mac") String mac, @Query("androidId") String androidId, @Query("timestamp") String timestamp);

    //最近节日
    @GET
    Observable<YearBean> getyear(@Url() String url);
}
