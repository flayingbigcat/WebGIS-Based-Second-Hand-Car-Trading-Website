package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController @CrossOrigin(origins = "*", maxAge = 3600) // 允许所有源发起请求，有效时间为 3600 秒
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
    public ResponseEntity<String> userLogin(@RequestBody User user) {
        User loggedInUser = userService.userLogin(user);
        if (loggedInUser != null) {
            return new ResponseEntity<>("{\"message\":\"Login successful\"}", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("{\"error\":\"Invalid credentials\"}", HttpStatus.UNAUTHORIZED);
        }
    }
}
