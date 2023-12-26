package com.example.demo.service;

import com.example.demo.pojo.shop;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ShopService {
    List<shop> selectShop();
}
