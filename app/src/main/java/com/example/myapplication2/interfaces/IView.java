package com.example.myapplication2.interfaces;

import com.example.myapplication2.interfaces.data.IBatchUpdate_OneData;
import com.example.myapplication2.interfaces.data.IBatchUpdate_TwoData;
import com.example.myapplication2.interfaces.data.ILatestData;
import com.example.myapplication2.interfaces.data.INewsData;
import com.example.myapplication2.interfaces.data.IRankData;
import com.example.myapplication2.interfaces.data.IRecommend_indexData;
import com.example.myapplication2.interfaces.data.IResData;
import com.example.myapplication2.interfaces.data.ISubjectData;
import com.example.myapplication2.interfaces.data.IYearData;
import com.example.myapplication2.interfaces.data.ICategoryData;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.interfaces
 * 文件名： IView
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 9:00
 * 描述：TODO
 */
public interface IView extends INetWorkCollBack {
    //主页面内容
    interface Icontent extends News, Subject, BatchUpdate_One, Rank, Latest, Recommend_index, BatchUpdate_Two, Category {
        //选项栏内容
        interface INews {
            void setData(INewsData data, News view);
        }

        //文章
        interface ISubject {
            void setData(ISubjectData data, Subject view);
        }

        //我的订阅
        interface IBatchUpdate_One {
            void setData(IBatchUpdate_OneData data, BatchUpdate_One view);
        }

        //读物推荐
        interface IRank {
            void setData(IRankData data, Rank view);
        }

        //分类
        interface ICategory {
            void setData(ICategoryData data, Category view);
        }

        //最新内容
        interface ILatest {
            void setData(ILatestData data, Latest view);
        }

        //猜你喜欢
        interface IBatchUpdate_Two {
            void setData(IBatchUpdate_TwoData data, BatchUpdate_Two view);
        }
    }

    //文章页面
    interface IBooks extends Recommend_index {
        //推荐文章
        interface IRecommend_index {
            void setData(IRecommend_indexData data, Recommend_index view);
        }
    }

    //日历页面
    interface IDays extends Year {
        //最近节日
        interface IYear {
            void setData(IYearData data, Year view);
        }
    }

    //应用包名集合（暂时用不上）
    interface IPackages extends Res {
        //应用商店
        interface IRes {
            void setData(IResData data, Res view);
        }

    }


}
