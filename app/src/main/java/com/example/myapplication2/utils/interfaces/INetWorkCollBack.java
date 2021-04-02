package com.example.myapplication2.utils.interfaces;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.utils
 * 文件名： INetWorkCollBack
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 18:18
 * 描述：TODO
 */
public interface INetWorkCollBack {
    //选项栏内容
    interface News {
        <A> void setNews(A a);

        void setError(String error);
    }

    //文章
    interface Subject {
        <B> void setSubject(B b);

        void setError(String error);
    }

    //我的订阅
    interface BatchUpdate_One {
        <C> void setBatchUpdate_One(C c);

        void setError(String error);
    }

    //应用商店
    interface Res {
        <D> void setbatchUpdate_One(D d);

        void setError(String error);
    }

    //读物推荐
    interface Rank {
        <E> void setRank(E e);

        void setError(String error);
    }

    //分类
    interface Category {
        <F> void setCategory(F f);

        void setError(String error);
    }

    //最新内容
    interface Latest {
        <G> void setlatest(G g);

        void setError(String error);
    }

    //推荐文章
    interface Recommend_index {
        <H> void setrecommend_index(H h);

        void setError(String error);
    }

    //猜你喜欢
    interface BatchUpdate_Two {
        <I> void setBatchUpdate_Two(I i);

        void setError(String error);
    }

    //最近节日
    interface Year {
        <J> void setyear(J j);

        void setError(String error);
    }
}
