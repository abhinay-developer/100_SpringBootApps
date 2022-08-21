package com.abhi.springbootmysql.service;

import com.abhi.springbootmysql.model.User;
import com.abhi.springbootmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService {

   @Autowired
   private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        user.setCreatedDate(new Date());
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> getOneUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> createAllUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

}
