package com.teamtwo.dispatchmanagementsystem.service;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import com.teamtwo.dispatchmanagementsystem.model.User;
import com.teamtwo.dispatchmanagementsystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

//    public Optional<Order> getOrderById(Long id) {
//        return orderRepository.findById(id);
//    }

    public List<Order> getOrdersBySender(String sender) {
        return orderRepository.findBySender(sender);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
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

    public Order getOrderById(Long orderID) {
        Order order = orderRepository.getOrderById(orderID);
        return order;
    }
}