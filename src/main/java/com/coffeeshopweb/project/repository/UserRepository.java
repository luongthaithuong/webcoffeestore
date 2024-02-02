package com.coffeeshopweb.project.repository;

import com.coffeeshopweb.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);

}
