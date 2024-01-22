package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "chatcommunity")
public class ChatCommunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long it;
    private String message;
    private Timestamp created_at;
    private Timestamp updated_at;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public ChatCommunity() {
    }

    public ChatCommunity(Long it, String message, Timestamp created_at, Timestamp updated_at, Users users) {
        this.it = it;
        this.message = message;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.users = users;
    }

    public Long getIt() {
        return it;
    }

    public void setIt(Long it) {
        this.it = it;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
