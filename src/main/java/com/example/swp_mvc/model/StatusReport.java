package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "statusreport")
public class StatusReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;
    private String content;

    public StatusReport() {
    }

    public StatusReport(Long statusId, String content) {
        this.statusId = statusId;
        this.content = content;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
