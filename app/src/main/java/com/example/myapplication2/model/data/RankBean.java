package com.example.myapplication2.model.data;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： RankBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class RankBean {

    /**
     * comic_id : 59692
     * title : 爱尔夫罗伊德森圣国物语
     * authors : 加藤拓弍
     * status : 连载中
     * cover : https://images.dmzj1.com/webpic/2/aissdacvas2021329.jpg
     * types : 性转换
     * last_updatetime : 1617191977
     * last_update_chapter_name : 第12话
     * comic_py : aierfuluoyidesenshenguowuyu
     * num : 720538
     * tag_id : 2304
     */

    private int comic_id;
    private String title;
    private String authors;
    private String status;
    private String cover;
    private String types;
    private int last_updatetime;
    private String last_update_chapter_name;
    private String comic_py;
    private int num;
    private int tag_id;

    public int getComic_id() {
        return comic_id;
    }

    public void setComic_id(int comic_id) {
        this.comic_id = comic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getLast_updatetime() {
        return last_updatetime;
    }

    public void setLast_updatetime(int last_updatetime) {
        this.last_updatetime = last_updatetime;
    }

    public String getLast_update_chapter_name() {
        return last_update_chapter_name;
    }

    public void setLast_update_chapter_name(String last_update_chapter_name) {
        this.last_update_chapter_name = last_update_chapter_name;
    }

    public String getComic_py() {
        return comic_py;
    }

    public void setComic_py(String comic_py) {
        this.comic_py = comic_py;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }
}
