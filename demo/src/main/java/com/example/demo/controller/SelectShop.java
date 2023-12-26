package com.example.demo.controller;

import com.example.demo.pojo.shop;
import com.example.demo.service.ShopService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SelectShop {
    @Resource
    private ShopService shopService;
    @PostMapping("/selectShop")
    List<shop> selectShop(){
       return shopService.selectShop();
    }
}
