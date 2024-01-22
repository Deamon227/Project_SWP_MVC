package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "wards")
public class Wards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int district_id;
    private String name;

    public Wards() {
    }

    public Wards(Long id, int district_id, String name) {
        this.id = id;
        this.district_id = district_id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
