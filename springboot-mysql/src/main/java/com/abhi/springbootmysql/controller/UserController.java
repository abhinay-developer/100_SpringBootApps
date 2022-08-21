package com.abhi.springbootmysql.controller;

import com.abhi.springbootmysql.model.User;
import com.abhi.springbootmysql.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {
  @Autowired
  private UserServiceImpl userServiceImpl;

    @PostMapping("/users")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        User createUser=userServiceImpl.createUser(user);
        return  new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public ResponseEntity<?> findAllUser(){
        List<User> usersList=userServiceImpl.getAllUsers();
        return  new ResponseEntity<>(usersList, HttpStatus.OK);
    }
    @PostMapping("/saveAllUsers")
    public ResponseEntity<?> saveAllUsers(@RequestBody List<User> users){
        List<User> usersList=userServiceImpl.createAllUsers(users);
        return  new ResponseEntity<>(usersList, HttpStatus.CREATED);
    }

}
