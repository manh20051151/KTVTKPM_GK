package com.example.JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JWT.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
