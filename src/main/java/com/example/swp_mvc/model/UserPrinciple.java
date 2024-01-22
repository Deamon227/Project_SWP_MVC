package com.example.swp_mvc.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UserPrinciple implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private Collection<? extends GrantedAuthority> types;

    public UserPrinciple(Long id,
                         String username, String password,
                         Collection<? extends GrantedAuthority> types) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.types = types;
    }

    public static UserPrinciple build(Users user) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getType().getName()));

        return new UserPrinciple(
                user.getId(),
                user.getUserName(),
                user.getPassWord(),
                authorities
        );
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return types;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPrinciple user = (UserPrinciple) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
