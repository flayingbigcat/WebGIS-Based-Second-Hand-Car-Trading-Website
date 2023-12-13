package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.userMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private userMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }


    @Override
    public boolean addUser(User user) {
        if(userMapper.addUser(user)){
            return  true;
        }
        return false;
    }

    @Override
    public boolean addUserCheckIsExist(User user) {
        if(userMapper.addUserCheckIsExist(user)){
            return  true;
        }
        return false;
    }

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public User userLogin(User user) {
        return userMapper.userLogin(user);
    }
}
