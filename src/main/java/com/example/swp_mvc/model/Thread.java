package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String topic;

    public Thread() {
    }

    public Thread(Long id, String topic) {
        this.id = id;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
