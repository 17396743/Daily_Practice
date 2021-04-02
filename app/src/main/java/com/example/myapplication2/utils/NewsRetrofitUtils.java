package com.example.myapplication2.utils;

import com.example.myapplication2.model.data.NewsBean;
import com.example.myapplication2.utils.api.ApiServer;
import com.example.myapplication2.utils.api.URLContrat;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;
import com.example.myapplication2.utils.interfaces.INetWorkInterface;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.utils
 * 文件名： RetrofitUtils
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 18:23
 * 描述：TODO
 */
public class NewsRetrofitUtils implements INetWorkInterface.getNews {
    private static NewsRetrofitUtils retrofitUtils;
    private final ApiServer apiServer;

    public NewsRetrofitUtils() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(URLContrat.NewsURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiServer = build.create(ApiServer.class);
    }

    public static NewsRetrofitUtils getInstance() {
        if (retrofitUtils == null) {

            synchronized (NewsRetrofitUtils.class) {
                retrofitUtils = new NewsRetrofitUtils();
            }
        }
        return retrofitUtils;
    }


    @Override
    public <A> void getNews(String url, String mnc, String ch, String display, String nmnc, String app_lan, String pid, String mcc, String nmcc, String osv, String pf, String v, String appv, String lan, String action, String model, String net, String aid, String brand, INetWorkCollBack.News view) {
        apiServer.getnews(url, mnc, ch, display, nmnc, app_lan, pid, mcc, nmcc, osv, pf, v, appv, lan, action, model, net, aid, brand)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull NewsBean newsBean) {
                        view.setNews(newsBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.setError("" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
