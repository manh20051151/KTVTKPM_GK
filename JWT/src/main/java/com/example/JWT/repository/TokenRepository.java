package com.example.JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JWT.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
