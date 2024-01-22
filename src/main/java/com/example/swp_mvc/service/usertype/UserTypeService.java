package com.example.swp_mvc.service.usertype;

import com.example.swp_mvc.model.UsersTypes;
import com.example.swp_mvc.repository.UserTypeRepository;
import com.example.swp_mvc.service.IGeneratedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserTypeService implements IUserTypeService {
    @Autowired
    private UserTypeRepository userTypeRepository;
    @Override
    public Iterable<UsersTypes> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public void save(UsersTypes usersTypes) {
        userTypeRepository.save(usersTypes);
    }

    @Override
    public Optional<UsersTypes> findById(Long id) {
        return userTypeRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        userTypeRepository.deleteById(id);
    }
}
