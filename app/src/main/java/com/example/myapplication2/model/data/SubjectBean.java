package com.example.myapplication2.model.data;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： SubjectBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class SubjectBean {

    /**
     * id : 445
     * title : 新漫周刊第95期 一周新漫推荐
     * short_title : 新漫周刊九十五期
     * create_time : 1611742182
     * small_cover : https://images.dmzj1.com/subject/445/small_cover_1611742182.jpg
     * page_type : 3
     * sort : 4450
     * page_url : xinmanzhoukan95
     */

    private int id;
    private String title;
    private String short_title;
    private int create_time;
    private String small_cover;
    private int page_type;
    private int sort;
    private String page_url;

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

    public String getShort_title() {
        return short_title;
    }

    public void setShort_title(String short_title) {
        this.short_title = short_title;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public String getSmall_cover() {
        return small_cover;
    }

    public void setSmall_cover(String small_cover) {
        this.small_cover = small_cover;
    }

    public int getPage_type() {
        return page_type;
    }

    public void setPage_type(int page_type) {
        this.page_type = page_type;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }
}
