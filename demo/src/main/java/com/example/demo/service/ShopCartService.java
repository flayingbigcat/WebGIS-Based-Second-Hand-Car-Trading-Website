package com.example.demo.service;

import com.example.demo.pojo.ShopCart;
import org.springframework.stereotype.Service;

@Service

public interface ShopCartService {
    ShopCart addShopCart(ShopCart shopCart);
}
