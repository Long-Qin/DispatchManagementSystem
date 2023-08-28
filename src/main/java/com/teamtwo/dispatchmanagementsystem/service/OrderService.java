package com.teamtwo.dispatchmanagementsystem.service;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import com.teamtwo.dispatchmanagementsystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public Long add(Order order) {
        return orderRepository.save(order).getOrderID();
    }
    public List<Order> getOrderBySender(String sender){
        return orderRepository.findBySender(sender);
    }
}
