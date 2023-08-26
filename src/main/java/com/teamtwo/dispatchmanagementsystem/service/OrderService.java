package com.teamtwo.dispatchmanagementsystem.service;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import com.teamtwo.dispatchmanagementsystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void add(Order order) {
        orderRepository.save(order);
    }

}
