package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.shopCartMapper;
import com.example.demo.pojo.ShopCart;
import com.example.demo.service.ShopCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopCArtServiceImpl implements ShopCartService {
    @Resource
    private shopCartMapper shopCartMapper;
    @Override
    public ShopCart addShopCart(ShopCart shopCart) {
        return shopCartMapper.addShopCart(shopCart);
    }
}
