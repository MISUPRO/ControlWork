package com.example.controlwork.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hv1sys_shop_products")
public class ShopProduct {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "photo")
    private String photo;

    @Column(name = "price")
    private Integer price;

    @Column(name = "store")
    private Integer store;

    @Column(name = "commentable")
    private Boolean commentable;

    @Column(name = "only_one_buy")
    private Boolean onlyOneBuy;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;

    @Column(name = "updated_at")
    private java.sql.Timestamp updatedAt;

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
    public Integer getStore() { return store; }
    public void setStore(Integer store) { this.store = store; }
    public Boolean getCommentable() { return commentable; }
    public void setCommentable(Boolean commentable) { this.commentable = commentable; }
    public Boolean getOnlyOneBuy() { return onlyOneBuy; }
    public void setOnlyOneBuy(Boolean onlyOneBuy) { this.onlyOneBuy = onlyOneBuy; }
    public java.sql.Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(java.sql.Timestamp createdAt) { this.createdAt = createdAt; }
    public java.sql.Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(java.sql.Timestamp updatedAt) { this.updatedAt = updatedAt; }
}