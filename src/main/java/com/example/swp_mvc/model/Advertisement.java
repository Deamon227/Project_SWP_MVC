package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int view;
    private int goal;
    private int status;
    //1 for yes, 2 for no
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public Advertisement() {
    }

    public Advertisement(Long id, int view, int goal, int status, Products products) {
        this.id = id;
        this.view = view;
        this.goal = goal;
        this.status = status;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
