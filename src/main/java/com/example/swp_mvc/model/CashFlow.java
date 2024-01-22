package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cashflow")
public class CashFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String optionalType;
    private Timestamp created_at;
    private Timestamp updated_at;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public CashFlow() {
    }

    public CashFlow(Long id, String content, String optionalType, Timestamp created_at, Timestamp updated_at, Users users) {
        this.id = id;
        this.content = content;
        this.optionalType = optionalType;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.users = users;
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

    public String getOptionalType() {
        return optionalType;
    }

    public void setOptionalType(String optionalType) {
        this.optionalType = optionalType;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
