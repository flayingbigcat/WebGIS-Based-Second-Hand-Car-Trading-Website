package com.example.demo.service;

import com.example.demo.pojo.order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public boolean addOrder(order order);
}
