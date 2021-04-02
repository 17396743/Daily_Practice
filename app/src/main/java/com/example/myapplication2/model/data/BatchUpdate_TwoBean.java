package com.example.myapplication2.model.data;

import java.util.List;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： BatchUpdate_TwoBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class BatchUpdate_TwoBean {

    /**
     * code : 0
     * msg :
     * beandata : {"category_id":49,"title":"我的订阅","sort":2,"bean":[{"authors":"","cover":"https://images.dmzj1.com/webpic/12/190907zl40ydwybdysjqzl.jpg","id":39328,"status":"连载中","sub_readed":0,"title":"中了40亿的我要搬到异世界去住了","uid":110111402},{"authors":"","cover":"https://images.dmzj1.com/webpic/19/jiubaotongxuebufangguowojsi.jpg","id":50758,"status":"连载中","sub_readed":0,"title":"久保同学不放过我","uid":110111402},{"authors":"","cover":"https://images.dmzj1.com/webpic/12/200202dqmmwwd.jpg","id":46143,"status":"连载中","sub_readed":0,"title":"爹强妈猛我无敌","uid":110111402}]}
     */

    private int code;
    private String msg;
    private BeandataBean beandata;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BeandataBean getBeandata() {
        return beandata;
    }

    public void setBeandata(BeandataBean beandata) {
        this.beandata = beandata;
    }

    public static class BeandataBean {
        /**
         * category_id : 49
         * title : 我的订阅
         * sort : 2
         * bean : [{"authors":"","cover":"https://images.dmzj1.com/webpic/12/190907zl40ydwybdysjqzl.jpg","id":39328,"status":"连载中","sub_readed":0,"title":"中了40亿的我要搬到异世界去住了","uid":110111402},{"authors":"","cover":"https://images.dmzj1.com/webpic/19/jiubaotongxuebufangguowojsi.jpg","id":50758,"status":"连载中","sub_readed":0,"title":"久保同学不放过我","uid":110111402},{"authors":"","cover":"https://images.dmzj1.com/webpic/12/200202dqmmwwd.jpg","id":46143,"status":"连载中","sub_readed":0,"title":"爹强妈猛我无敌","uid":110111402}]
         */

        private int category_id;
        private String title;
        private int sort;
        private List<BeanBean> bean;

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

        public List<BeanBean> getBean() {
            return bean;
        }

        public void setBean(List<BeanBean> bean) {
            this.bean = bean;
        }

        public static class BeanBean {
            /**
             * authors :
             * cover : https://images.dmzj1.com/webpic/12/190907zl40ydwybdysjqzl.jpg
             * id : 39328
             * status : 连载中
             * sub_readed : 0
             * title : 中了40亿的我要搬到异世界去住了
             * uid : 110111402
             */

            private String authors;
            private String cover;
            private int id;
            private String status;
            private int sub_readed;
            private String title;
            private int uid;

            public String getAuthors() {
                return authors;
            }

            public void setAuthors(String authors) {
                this.authors = authors;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getSub_readed() {
                return sub_readed;
            }

            public void setSub_readed(int sub_readed) {
                this.sub_readed = sub_readed;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }
        }
    }
}
