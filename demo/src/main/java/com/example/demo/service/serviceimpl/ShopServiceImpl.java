package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.shopMapper;
import com.example.demo.pojo.shop;
import com.example.demo.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private shopMapper shopMapper;
    @Override
    public List<shop> selectShop() {
        return shopMapper.selectShop();
    }
}
