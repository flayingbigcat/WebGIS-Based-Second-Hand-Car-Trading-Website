package com.example.demo.service;

import com.example.demo.pojo.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product selectProductById(int id);
}
