package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SelectUser {
//    public static void main(String[] args) {
//
//    }
    @Resource
    private UserService userService;


    @GetMapping("/aaa")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PostMapping("/addUsercc")
    public void addUserCheckIsExist(@RequestBody User user){
        if(userService.selectUserById(user.getUser_id())==null){
            userService.addUserCheckIsExist(user);
        }

//        userService.addUser(user);
    }
    @PostMapping("/LoginPage")
    public User userLogin(@RequestBody User user){
        return userService.userLogin(user);  
    }
}
