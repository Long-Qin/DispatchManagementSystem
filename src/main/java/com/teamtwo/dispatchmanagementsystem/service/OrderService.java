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


    public Order add(Order order) {orderRepository.save(order)

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getOrdersBySender(String sender) {
        return orderRepository.findBySender(sender);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    public List<Long> getOrderBySender(String sender){
        return orderRepository.findIdBySender(sender);
    }


    public Order updateOrderStatus(Long id, String orderStatus) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            Order existingOrder = optionalOrder.get();
            existingOrder.setOrderStatus(orderStatus);
            return orderRepository.save(existingOrder);
        }
        return null;
    }
}

