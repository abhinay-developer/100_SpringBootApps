package com.abhi.springbootmysql.service;

import com.abhi.springbootmysql.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getOneUser(Long id);
    public List<User> createAllUsers(List<User> users);
}
