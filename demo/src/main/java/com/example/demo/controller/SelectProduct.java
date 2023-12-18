package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SelectProduct {
    @Resource
    private ProductService productService;
    @PostMapping("/selectId")
    public Product selectProductById(@RequestParam("id") int id){
        // 修改 selectProductById 方法，使其返回包含 name 和 price 的 Product 对象
        Product product = productService.selectProductById(id);
        return product;
    }
//
    @PostMapping("/deleteProduct")
    public boolean deleteProductById(@RequestParam("id") int id){
        return productService.deleteProduct(id);
    }

    @PostMapping("/getProduct")
    List<Product> getProduct(){
        return productService.getProduct();
    }
}
