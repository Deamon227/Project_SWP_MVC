package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "productimages")
public class ProductsImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;
    private String name;
    private String path;
    private Timestamp created_at;
    private Timestamp updated_at;

    public ProductsImages() {
    }

    public ProductsImages(Products products, String name, String path, Timestamp created_at, Timestamp updated_at) {
        this.products = products;
        this.name = name;
        this.path = path;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
