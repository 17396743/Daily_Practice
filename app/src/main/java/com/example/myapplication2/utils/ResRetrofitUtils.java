package com.example.myapplication2.utils;

import com.example.myapplication2.model.data.ResBean;
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
public class ResRetrofitUtils implements INetWorkInterface.getRes{
    private static ResRetrofitUtils retrofitUtils;
    private final ApiServer apiServer;

    public ResRetrofitUtils(){
        Retrofit build = new Retrofit.Builder()
                .baseUrl(URLContrat.ResURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiServer = build.create(ApiServer.class);
    }
    public static ResRetrofitUtils getInstance(){
        if (retrofitUtils == null){

            synchronized (ResRetrofitUtils.class){
                retrofitUtils = new ResRetrofitUtils();
            }
        }
        return retrofitUtils;
    }



    @Override
    public <D> void getRes(String url, INetWorkCollBack.Res view) {
        apiServer.getres(url)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<ResBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResBean resBean) {
                        view.setbatchUpdate_One(resBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.setError(""+e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
