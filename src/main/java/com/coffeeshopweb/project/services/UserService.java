package com.coffeeshopweb.project.services;

import com.coffeeshopweb.project.models.User;

public interface UserService {
    User findByUserName(String username);
}
