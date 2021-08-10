package com.lyw.wiki.admin.entity;

import java.io.Serializable;

/**
 * 电子书(Ebook)实体类
 *
 * @author LiuYaoWen
 * @since 2021-08-10 15:01:41
 */
public class Ebook implements Serializable {
    private static final long serialVersionUID = 121503378380445147L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 第一级分类
     */
    private Long categoryOneId;
    /**
     * 第二级分类
     */
    private Long categoryTwoId;
    /**
     * 描述
     */
    private String description;
    /**
     * 封面
     */
    private String cover;
    /**
     * 文档数
     */
    private Integer docCount;
    /**
     * 阅读数
     */
    private Integer viewCount;
    /**
     * 点赞数
     */
    private Integer voteCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryOneId() {
        return categoryOneId;
    }

    public void setCategoryOneId(Long categoryOneId) {
        this.categoryOneId = categoryOneId;
    }

    public Long getCategoryTwoId() {
        return categoryTwoId;
    }

    public void setCategoryTwoId(Long categoryTwoId) {
        this.categoryTwoId = categoryTwoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

}
