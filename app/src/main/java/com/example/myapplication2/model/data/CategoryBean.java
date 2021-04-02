package com.example.myapplication2.model.data;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： CategoryBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class CategoryBean {

    /**
     * tag_id : 3262
     * title : 少年漫
     * cover : https://images.dmzj1.com/tuijian/222_222/180720shaonianman.jpg
     */

    private int tag_id;
    private String title;
    private String cover;

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
