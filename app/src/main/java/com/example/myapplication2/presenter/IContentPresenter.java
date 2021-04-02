package com.example.myapplication2.presenter;

import com.example.myapplication2.interfaces.INetWorkCollBack;
import com.example.myapplication2.interfaces.IPresenter;
import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.IBatchUpdate_OneData;
import com.example.myapplication2.interfaces.data.IBatchUpdate_TwoData;
import com.example.myapplication2.interfaces.data.ICategoryData;
import com.example.myapplication2.interfaces.data.ILatestData;
import com.example.myapplication2.interfaces.data.INewsData;
import com.example.myapplication2.interfaces.data.IRankData;
import com.example.myapplication2.interfaces.data.ISubjectData;
import com.example.myapplication2.model.BatchUpdate_One;
import com.example.myapplication2.model.BatchUpdate_Two;
import com.example.myapplication2.model.Category;
import com.example.myapplication2.model.Latest;
import com.example.myapplication2.model.News;
import com.example.myapplication2.model.Rank;
import com.example.myapplication2.model.Subject;
import com.example.myapplication2.utils.api.URLContrat;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.presenter
 * 文件名： IcontentPresenter
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 18:32
 * 描述：TODO
 */
public class IContentPresenter implements IPresenter.GetDataContrat {
    private IView.Icontent.IBatchUpdate_One batchUpdate_one;
    private IView.Icontent.IBatchUpdate_Two batchUpdate_two;
    private IView.Icontent.ILatest latest;
    private IView.Icontent.INews news;
    private IView.Icontent.IRank rank;
    private IView.Icontent.ISubject subject;
    private IView.Icontent.ICategory category;
    private IView.Icontent icontent;

    public IContentPresenter(IView.Icontent icontent) {
        this.category = new Category();
        this.batchUpdate_one = new BatchUpdate_One();
        this.batchUpdate_two = new BatchUpdate_Two();
        this.latest = new Latest();
        this.news = new News();
        this.rank = new Rank();
        this.subject = new Subject();
        this.icontent = icontent;
    }

    @Override
    public IContentPresenter getData() {
        IBatchUpdate_One();
        IBatchUpdate_Two();
        ILatest();
        INews();
        IRank();
        ISubject();
        ICategory();
        return this;
    }

    @Override
    public void IBatchUpdate_One() {
        batchUpdate_one.setData(new IBatchUpdate_OneData() {
            @Override
            public String url() {
                return URLContrat.NEWBatchUpdate_OneURL;
            }

            @Override
            public String uid() {
                return URLContrat.BatchUpdate_uid;
            }

            @Override
            public String app_channel() {
                return URLContrat.BatchUpdate_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.BatchUpdate_terminal_model;
            }

            @Override
            public String category_id() {
                return URLContrat.BatchUpdate_category_id;
            }

            @Override
            public String channel() {
                return URLContrat.BatchUpdate_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.BatchUpdate__debug;
            }

            @Override
            public String imei() {
                return URLContrat.BatchUpdate_imei;
            }

            @Override
            public String version() {
                return URLContrat.BatchUpdate_version;
            }

            @Override
            public String mac() {
                return URLContrat.BatchUpdate_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.BatchUpdate_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.BatchUpdate_timestamp;
            }
        }, new INetWorkCollBack.BatchUpdate_One() {
            @Override
            public <C> void setBatchUpdate_One(C c) {
                icontent.setBatchUpdate_One(c);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void IBatchUpdate_Two() {
        batchUpdate_two.setData(new IBatchUpdate_TwoData() {
            @Override
            public String url() {
                return URLContrat.NEWBatchUpdate_TwoURL;
            }

            @Override
            public String uid() {
                return URLContrat.BatchUpdate_Two_uid;
            }

            @Override
            public String app_channel() {
                return URLContrat.BatchUpdate_Two_terminal_model;
            }

            @Override
            public String terminal_model() {
                return URLContrat.BatchUpdate_Two_category_id;
            }

            @Override
            public String channel() {
                return URLContrat.BatchUpdate_Two_app_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.BatchUpdate_Two__debug;
            }

            @Override
            public String imei() {
                return URLContrat.BatchUpdate_Two_imei;
            }

            @Override
            public String version() {
                return URLContrat.BatchUpdate_Two_version;
            }

            @Override
            public String mac() {
                return URLContrat.BatchUpdate_Two_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.BatchUpdate_Two_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.BatchUpdate_Two_timestamp;
            }
        }, new INetWorkCollBack.BatchUpdate_Two() {
            @Override
            public <I> void setBatchUpdate_Two(I i) {
                icontent.setBatchUpdate_Two(i);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void ILatest() {
        latest.setData(new ILatestData() {
            @Override
            public String url() {
                return URLContrat.NEWLatestURL;
            }

            @Override
            public String app_channel() {
                return URLContrat.Latest_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.Latest_terminal_model;
            }

            @Override
            public String channel() {
                return URLContrat.Latest_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.Latest__debug;
            }

            @Override
            public String imei() {
                return URLContrat.Latest_imei;
            }

            @Override
            public String version() {
                return URLContrat.Latest_version;
            }

            @Override
            public String mac() {
                return URLContrat.Latest_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.Latest_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.Latest_timestamp;
            }
        }, new INetWorkCollBack.Latest() {
            @Override
            public <G> void setlatest(G g) {
                icontent.setlatest(g);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void INews() {
        news.setData(new INewsData() {
            @Override
            public String url() {
                return URLContrat.NENewsWURL;
            }

            @Override
            public String mnc() {
                return URLContrat.News_mnc;
            }

            @Override
            public String ch() {
                return URLContrat.News_ch;
            }

            @Override
            public String display() {
                return URLContrat.News_display;
            }

            @Override
            public String nmnc() {
                return URLContrat.News_nmnc;
            }

            @Override
            public String app_lan() {
                return URLContrat.News_app_lan;
            }

            @Override
            public String pid() {
                return URLContrat.News_pid;
            }

            @Override
            public String mcc() {
                return URLContrat.News_mcc;
            }

            @Override
            public String nmcc() {
                return URLContrat.News_nmcc;
            }

            @Override
            public String osv() {
                return URLContrat.News_osv;
            }

            @Override
            public String pf() {
                return URLContrat.News_pf;
            }

            @Override
            public String v() {
                return URLContrat.News_v;
            }

            @Override
            public String appv() {
                return URLContrat.News_appv;
            }

            @Override
            public String lan() {
                return URLContrat.News_lan;
            }

            @Override
            public String action() {
                return URLContrat.News_action;
            }

            @Override
            public String model() {
                return URLContrat.News_model;
            }

            @Override
            public String net() {
                return URLContrat.News_net;
            }

            @Override
            public String aid() {
                return URLContrat.News_aid;
            }

            @Override
            public String brand() {
                return URLContrat.News_brand;
            }
        }, new INetWorkCollBack.News() {
            @Override
            public <A> void setNews(A a) {
                icontent.setNews(a);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void IRank() {
        rank.setData(new IRankData() {
            @Override
            public String url() {
                return URLContrat.NEWRankURL;
            }

            @Override
            public String app_channel() {
                return URLContrat.Rank_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.Rank_terminal_model;
            }

            @Override
            public String channel() {
                return URLContrat.Rank_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.Rank__debug;
            }

            @Override
            public String imei() {
                return URLContrat.Rank_imei;
            }

            @Override
            public String version() {
                return URLContrat.Rank_version;
            }

            @Override
            public String mac() {
                return URLContrat.Rank_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.Rank_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.Rank_timestamp;
            }
        }, new INetWorkCollBack.Rank() {
            @Override
            public <E> void setRank(E e) {
                icontent.setRank(e);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void ISubject() {
        subject.setData(new ISubjectData() {
            @Override
            public String url() {
                return URLContrat.NESubjectWURL;
            }

            @Override
            public String app_channel() {
                return URLContrat.Subject_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.Subject_terminal_model;
            }

            @Override
            public String channel() {
                return URLContrat.Subject_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.Subject__debug;
            }

            @Override
            public String imei() {
                return URLContrat.Subject_imei;
            }

            @Override
            public String version() {
                return URLContrat.Subject_version;
            }

            @Override
            public String mac() {
                return URLContrat.Subject_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.Subject_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.Subject_timestamp;
            }
        }, new INetWorkCollBack.Subject() {
            @Override
            public <B> void setSubject(B b) {
                icontent.setSubject(b);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }

    @Override
    public void ICategory() {
        category.setData(new ICategoryData() {
            @Override
            public String url() {
                return URLContrat.NEWCategoryURL;
            }

            @Override
            public String app_channel() {
                return URLContrat.Category_app_channel;
            }

            @Override
            public String terminal_model() {
                return URLContrat.Category_terminal_model;
            }

            @Override
            public String channel() {
                return URLContrat.Category_channel;
            }

            @Override
            public String _debug() {
                return URLContrat.Category__debug;
            }

            @Override
            public String imei() {
                return URLContrat.Category_imei;
            }

            @Override
            public String version() {
                return URLContrat.Category_version;
            }

            @Override
            public String mac() {
                return URLContrat.Category_mac;
            }

            @Override
            public String androidId() {
                return URLContrat.Category_androidId;
            }

            @Override
            public String timestamp() {
                return URLContrat.Category_timestamp;
            }
        }, new INetWorkCollBack.Category() {
            @Override
            public <F> void setCategory(F f) {
                icontent.setCategory(f);
            }

            @Override
            public void setError(String error) {
                icontent.setError(error);
            }
        });
    }
}
