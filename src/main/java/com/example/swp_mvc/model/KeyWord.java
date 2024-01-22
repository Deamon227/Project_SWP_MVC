package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "keyword")
public class KeyWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    private String content;

    public KeyWord() {
    }

    public KeyWord(Long id, Users users, String content) {
        this.id = id;
        this.users = users;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
