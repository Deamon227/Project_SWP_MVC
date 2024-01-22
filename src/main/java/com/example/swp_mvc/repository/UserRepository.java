package com.example.swp_mvc.repository;

import com.example.swp_mvc.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
    Users findByUserName(String name);
}
