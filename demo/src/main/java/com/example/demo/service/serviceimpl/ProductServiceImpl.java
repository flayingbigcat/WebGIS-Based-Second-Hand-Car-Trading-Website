package com.example.demo.service.serviceimpl;

import com.example.demo.mapper.productMapper;
import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private com.example.demo.mapper.productMapper productMapper;
    public Product selectProductById(int id) {
        return productMapper.selectProductById(id);
    }
}
