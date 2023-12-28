package com.example.demo.controller;

import com.example.demo.pojo.ShopCart;
import com.example.demo.service.ShopCartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SelectShopCart {
    @Resource
    private ShopCartService shopCartService;
    @PostMapping("/addShopCart")
    boolean addShopCart(@RequestBody ShopCart shopCart){
        return shopCartService.addShopCart(shopCart);
    }
}
