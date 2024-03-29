package com.example.JWT.service;

import com.example.JWT.authen.UserPrincipal;
import com.example.JWT.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
