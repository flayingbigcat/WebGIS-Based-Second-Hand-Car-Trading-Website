package com.example.demo.mapper;

import com.example.demo.pojo.shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface shopMapper {
    List<shop> selectShop();
}
