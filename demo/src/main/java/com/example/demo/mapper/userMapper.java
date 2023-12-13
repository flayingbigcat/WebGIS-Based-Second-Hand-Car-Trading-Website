package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface userMapper {
    /**
     * 查询所有
     */
    public List<User> selectAll();
    public boolean addUser(User user);
    public boolean addUserCheckIsExist(User user);
    public User selectUserById(int id);
    public User userLogin(User user);
}
