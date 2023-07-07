package com.app.repository;

import com.app.entities.User;

import java.util.List;

public interface UserRepository {

    User createUser(User user);
    List<User> findAll();
}
