package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    private int starNo;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Rating() {
    }

    public Rating(Long id, String content, Products products, Users users, int starNo, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.content = content;
        this.products = products;
        this.users = users;
        this.starNo = starNo;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getStarNo() {
        return starNo;
    }

    public void setStarNo(int starNo) {
        this.starNo = starNo;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
