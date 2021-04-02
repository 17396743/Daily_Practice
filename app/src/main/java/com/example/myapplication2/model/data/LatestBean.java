package com.example.myapplication2.model.data;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： LatestBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class LatestBean {


    /**
     * id : 52094
     * title : 尚未知晓彼此心意的两人
     * islong : 2
     * authors : 东ふゆ
     * types : 爱情/职场
     * cover : https://images.dmzj1.com/webpic/18/liangren220200301.jpg
     * status : 连载中
     * last_update_chapter_name : 连载15
     * last_update_chapter_id : 110833
     * last_updatetime : 1617350511
     */

    private int id;
    private String title;
    private int islong;
    private String authors;
    private String types;
    private String cover;
    private String status;
    private String last_update_chapter_name;
    private int last_update_chapter_id;
    private int last_updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIslong() {
        return islong;
    }

    public void setIslong(int islong) {
        this.islong = islong;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLast_update_chapter_name() {
        return last_update_chapter_name;
    }

    public void setLast_update_chapter_name(String last_update_chapter_name) {
        this.last_update_chapter_name = last_update_chapter_name;
    }

    public int getLast_update_chapter_id() {
        return last_update_chapter_id;
    }

    public void setLast_update_chapter_id(int last_update_chapter_id) {
        this.last_update_chapter_id = last_update_chapter_id;
    }

    public int getLast_updatetime() {
        return last_updatetime;
    }

    public void setLast_updatetime(int last_updatetime) {
        this.last_updatetime = last_updatetime;
    }
}
