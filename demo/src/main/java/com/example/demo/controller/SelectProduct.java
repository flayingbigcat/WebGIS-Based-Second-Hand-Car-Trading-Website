package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SelectProduct {
    @Resource
    private ProductService productService;
    @PostMapping("/selectId")
    public Product selectProductById(@RequestParam("id") int id){
        return productService.selectProductById(id);
    }
}
