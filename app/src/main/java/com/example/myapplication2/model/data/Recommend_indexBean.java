package com.example.myapplication2.model.data;

import java.util.List;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： Recommend_indexBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class Recommend_indexBean {

    /**
     * category_id : 46
     * title : 大图推荐
     * sort : 1
     * data : [{"cover":"https://images.dmzj1.com/tuijian/750_480/210120xinman95tj5.jpg","title":"新漫95·猫猫、大腿、视觉系","sub_title":"新漫95·猫猫、大腿、视觉系","type":5,"url":"","obj_id":445,"status":""},{"cover":"https://images.dmzj1.com/tuijian/750_480/210331syxssh1.jpg","title":"治愈系田园牧场物语，阳光清风森林还有你","sub_title":"小森生活","type":10,"url":"","obj_id":228,"status":""},{"cover":"https://images.dmzj1.com/tuijian/750_480/210401xinwentj2.jpg","title":"今日份的测评·论斤称的佳佳娘（误）","sub_title":"今日份的测评·论斤称的佳佳娘（误）","type":7,"url":"https://v3api.dmzj1.com/article/show/v2/70508.html","obj_id":70508,"status":""},{"cover":"https://images.dmzj1.com/tuijian/750_480/210401xinwentj4.jpg","title":"原创同人文推荐·十指相扣的情书","sub_title":"原创同人文推荐·十指相扣的情书","type":6,"url":"http://nbbs.dmzj1.com/thread-1261812-1-1.html","obj_id":0,"status":""},{"cover":"https://images.dmzj1.com/tuijian/750_480/210331zhuanloutj1.jpg","title":"三浦和森恒二激情燃烧的岁月","sub_title":"三浦和森恒二激情燃烧的岁月","type":6,"url":"http://nbbs.dmzj1.com/thread-1362130-1-1.html","obj_id":0,"status":""},{"cover":"http://images.dmzj1.com/recommend_game_shadv_1.png","title":"宅家玩的游戏 总有一款是你的菜","sub_title":"宅家玩的游戏 总有一款是你的菜","type":999,"url":"http://www.shandw.com/auth","new_auth_url":"http://www.shandw.com/auth/visitor-auth.html","obj_id":0,"status":"","params":{"channel":14507,"key":"b65c1de327a8488ab9229ea7629376c8","sdw_simple":1}}]
     */

    private int category_id;
    private String title;
    private int sort;
    private List<DataBean> data;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cover : https://images.dmzj1.com/tuijian/750_480/210120xinman95tj5.jpg
         * title : 新漫95·猫猫、大腿、视觉系
         * sub_title : 新漫95·猫猫、大腿、视觉系
         * type : 5
         * url :
         * obj_id : 445
         * status :
         * new_auth_url : http://www.shandw.com/auth/visitor-auth.html
         * params : {"channel":14507,"key":"b65c1de327a8488ab9229ea7629376c8","sdw_simple":1}
         */

        private String cover;
        private String title;
        private String sub_title;
        private int type;
        private String url;
        private int obj_id;
        private String status;
        private String new_auth_url;
        private ParamsBean params;

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getObj_id() {
            return obj_id;
        }

        public void setObj_id(int obj_id) {
            this.obj_id = obj_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getNew_auth_url() {
            return new_auth_url;
        }

        public void setNew_auth_url(String new_auth_url) {
            this.new_auth_url = new_auth_url;
        }

        public ParamsBean getParams() {
            return params;
        }

        public void setParams(ParamsBean params) {
            this.params = params;
        }

        public static class ParamsBean {
            /**
             * channel : 14507
             * key : b65c1de327a8488ab9229ea7629376c8
             * sdw_simple : 1
             */

            private int channel;
            private String key;
            private int sdw_simple;

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public int getSdw_simple() {
                return sdw_simple;
            }

            public void setSdw_simple(int sdw_simple) {
                this.sdw_simple = sdw_simple;
            }
        }
    }
}
