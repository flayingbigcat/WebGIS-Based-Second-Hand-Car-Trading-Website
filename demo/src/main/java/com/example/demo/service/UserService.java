package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAllUser();
    public boolean addUser(User user);
    public boolean addUserCheckIsExist(User user);

    User selectUserByName(String name);

    public User userLogin(User user);
    String getUserNameByEmail(String user_email);

}
