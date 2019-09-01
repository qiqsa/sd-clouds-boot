package com.cloud.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Qi.qingshan on 2019/9/1
 */
@Entity
@Table(name = "tbproduct_comment")
public class ProductComment implements Serializable {

    private static final long serialVersionUID = 9151605660999096726L;
    /**
     * 评论主键Id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 评论作者Id
     */
    private Long authorId;

    /***
     * 评论内容
     */
    private String content;

    /**
     * 评论时间
     */
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }



    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", productId=" + productId +
                ", authorId=" + authorId +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
