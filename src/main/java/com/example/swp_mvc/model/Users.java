package com.example.swp_mvc.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String email_verified_at;
    private String passWord;
    @ManyToOne
    private UsersTypes type;
    private String address;
    private String gender;
    private String phoneNumber;
    private String avatar;
    private int status;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Users() {
    }

    public Users(Long id, String userName, String email, String email_verified_at, String passWord, String address, String gender, String phoneNumber, String avatar, int status, Timestamp created_at, Timestamp updated_at, UsersTypes type) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.email_verified_at = email_verified_at;
        this.passWord = passWord;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_verified_at() {
        return email_verified_at;
    }

    public void setEmail_verified_at(String email_verified_at) {
        this.email_verified_at = email_verified_at;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public UsersTypes getType() {
        return type;
    }

    public void setType(UsersTypes type) {
        this.type = type;
    }
}
