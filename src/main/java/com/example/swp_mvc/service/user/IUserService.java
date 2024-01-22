package com.example.swp_mvc.service.user;

import com.example.swp_mvc.model.Users;
import com.example.swp_mvc.service.IGeneratedService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneratedService<Users>, UserDetailsService {
    Users findByUserName(String name);
}
