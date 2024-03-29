package com.example.JWT.service;

import com.example.JWT.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);

}
