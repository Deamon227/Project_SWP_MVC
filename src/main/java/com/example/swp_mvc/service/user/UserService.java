package com.example.swp_mvc.service.user;

import com.example.swp_mvc.model.UserPrinciple;
import com.example.swp_mvc.model.Users;
import com.example.swp_mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public Iterable<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public Optional<Users> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return UserPrinciple.build(userRepository.findByUserName(username));
    }

    public Users findByUserName(String name){
        return userRepository.findByUserName(name);
    }
}
