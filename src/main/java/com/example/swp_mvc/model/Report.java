package com.example.swp_mvc.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private int created_by;
    private Timestamp created_at;
    private Timestamp updated_at;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Report() {
    }

    public Report(Long id, String description, int created_by, Timestamp created_at, Timestamp updated_at, Products products, Users users) {
        this.id = id;
        this.description = description;
        this.created_by = created_by;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.products = products;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
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
}
