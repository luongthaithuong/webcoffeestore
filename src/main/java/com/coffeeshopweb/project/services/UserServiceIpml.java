package com.coffeeshopweb.project.services;

import com.coffeeshopweb.project.models.User;
import com.coffeeshopweb.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIpml implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
