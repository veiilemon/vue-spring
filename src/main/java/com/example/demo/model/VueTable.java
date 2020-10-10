package com.example.demo.model;

/**
 * @author V
 */
public class VueTable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 目录名
     */
    private String title;

    /**findUserByName04
     *上级目录
     */
    private String reviewer;

    /**
     *拥有者
     */
    private String author;

    /**
     *所属项目
     */
    private String type;

    /**
     * 最新更新时间
     */
    private String timestamp;

    /**
     *描述
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp == null ? null : timestamp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
