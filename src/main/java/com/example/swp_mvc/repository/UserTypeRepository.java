package com.example.swp_mvc.repository;

import com.example.swp_mvc.model.UsersTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends CrudRepository<UsersTypes, Long> {
}
