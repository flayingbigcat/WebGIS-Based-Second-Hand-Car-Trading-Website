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
     List<User> selectAll();
     boolean addUser(User user);
     boolean addUserCheckIsExist(User user);
     User selectUserByName(String name);
     User userLogin(User user);
}
