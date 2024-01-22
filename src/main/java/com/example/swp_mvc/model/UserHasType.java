package com.example.swp_mvc.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;

@Entity
@Table(name = "userhastype")
public class UserHasType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private UsersTypes usersTypes;

    public UserHasType() {
    }

    public UserHasType(Users users, UsersTypes usersTypes) {
        this.users = users;
        this.usersTypes = usersTypes;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersTypes getUsersTypes() {
        return usersTypes;
    }

    public void setUsersTypes(UsersTypes usersTypes) {
        this.usersTypes = usersTypes;
    }
}
