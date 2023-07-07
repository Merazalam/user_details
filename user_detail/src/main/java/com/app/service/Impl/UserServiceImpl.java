package com.app.service.Impl;

import com.app.entities.User;
import com.app.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>();
    private long userId=1L;

    @Override
    public User save(User user) {
        user.setId(userId++);
        users.add(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }
}
