package com.example.swp_mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "verify")
public class Verify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cccdFront;
    private String cccdBack;
    private String profilePic;
    private String bankName;
    private String bankNo;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Verify() {
    }

    public Verify(Long id, String cccdFront, String cccdBack, String profilePic, String bankName, String bankNo, Users users) {
        this.id = id;
        this.cccdFront = cccdFront;
        this.cccdBack = cccdBack;
        this.profilePic = profilePic;
        this.bankName = bankName;
        this.bankNo = bankNo;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCccdFront() {
        return cccdFront;
    }

    public void setCccdFront(String cccdFront) {
        this.cccdFront = cccdFront;
    }

    public String getCccdBack() {
        return cccdBack;
    }

    public void setCccdBack(String cccdBack) {
        this.cccdBack = cccdBack;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
