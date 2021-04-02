package com.example.myapplication2.model.data;

import java.util.List;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： NewsBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:55
 * 描述：TODO
 */
public class NewsBean {

    /**
     * ret : 0
     * msg : ok
     * reset : 0
     * ttl : 3600
     * stime : 1617276215
     * data : [{"id":0,"display_name":"推荐","visible":true},{"id":48,"display_name":"视频","visible":true},{"id":2,"display_name":"社会","visible":true},{"id":3,"display_name":"娱乐","visible":true},{"id":6,"display_name":"科技","visible":true},{"id":5,"display_name":"军事","visible":true},{"id":8,"display_name":"汽车","visible":true},{"id":4,"display_name":"体育","visible":true},{"id":7,"display_name":"财经","visible":true},{"id":15,"display_name":"国际","visible":true},{"id":26,"display_name":"趣味","visible":true},{"id":12,"display_name":"健康","visible":true},{"id":9,"display_name":"房产","visible":true},{"id":10,"display_name":"时尚","visible":true},{"id":18,"display_name":"历史","visible":true},{"id":16,"display_name":"游戏","visible":true},{"id":22,"display_name":"减肥","visible":true}]
     */

    private int ret;
    private String msg;
    private int reset;
    private int ttl;
    private int stime;
    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public int getStime() {
        return stime;
    }

    public void setStime(int stime) {
        this.stime = stime;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 0
         * display_name : 推荐
         * visible : true
         */

        private int id;
        private String display_name;
        private boolean visible;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }

        public boolean isVisible() {
            return visible;
        }

        public void setVisible(boolean visible) {
            this.visible = visible;
        }
    }
}
