package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String content;
    private String avatar;
    private int status;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private int hot;
    private Long price;
    private int quantity;
    private int sale;
    private Long totalPay;
    private int totalRating;
    private int totalStar;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Products() {
    }

    public Products(Long id, String name, String description, String content, String avatar, int status, Category category, int hot, Long price, int quantity, int sale, Long totalPay, int totalRating, int totalStar, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.content = content;
        this.avatar = avatar;
        this.status = status;
        this.category = category;
        this.hot = hot;
        this.price = price;
        this.quantity = quantity;
        this.sale = sale;
        this.totalPay = totalPay;
        this.totalRating = totalRating;
        this.totalStar = totalStar;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public Long getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Long totalPay) {
        this.totalPay = totalPay;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public int getTotalStar() {
        return totalStar;
    }

    public void setTotalStar(int totalStar) {
        this.totalStar = totalStar;
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
