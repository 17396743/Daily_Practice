package com.example.myapplication2.view.ui;

import android.util.Log;

import com.example.myapplication2.R;
import com.example.myapplication2.adapter.BeanActivity;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.presenter.IContentPresenter;

public class MainActivity extends BeanActivity implements IView.Icontent {


    private static final String TAG = ".MainActivity";

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        getData();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected IContentPresenter getData() {
        return new IContentPresenter(this).getData();
    }


    @Override
    public <A> void setNews(A a) {
        Log.d(TAG, "setNews: "+"网络请求通过");
    }

    @Override
    public <B> void setSubject(B b) {
        Log.d(TAG, "setSubject: "+"网络请求通过");
    }

    @Override
    public <C> void setBatchUpdate_One(C c) {
        Log.d(TAG, "setBatchUpdate_One: "+"网络请求通过");
    }

    @Override
    public <E> void setRank(E e) {
        Log.d(TAG, "setRank: "+"网络请求通过");
    }

    @Override
    public <F> void setCategory(F f) {
        Log.d(TAG, "setCategory: "+"网络请求通过");
    }

    @Override
    public <G> void setlatest(G g) {
        Log.d(TAG, "setlatest: "+"网络请求通过");
    }

    @Override
    public <H> void setrecommend_index(H h) {
        Log.d(TAG, "setrecommend_index: "+"网络请求通过");
    }

    @Override
    public <I> void setBatchUpdate_Two(I i) {
        Log.d(TAG, "setBatchUpdate_Two: "+"网络请求通过");
    }

    @Override
    public void setError(String error) {
        Log.e(TAG, "setError: "+error);
    }
}