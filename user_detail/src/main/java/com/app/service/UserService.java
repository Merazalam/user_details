package com.app.service;

import com.app.entities.User;

import java.util.List;

public interface UserService {

    User save (User user);
    List <User> getAllUser();
}
