package com.teamtwo.dispatchmanagementsystem.controller;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import com.teamtwo.dispatchmanagementsystem.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping ("/{id}")
    public Order getOrderById(@PathVariable String id){
        return null;
    }
    @GetMapping("/sent/{sender}")
    public List<Order> getOrderBySender(@PathVariable String sender){
        return null;
    }
    @GetMapping("/received/{receiver}")
    public List<Order> getOrderByReceiver(@PathVariable String receiver){
        return null;
    }
    @PostMapping("/place")
    public void placeOrder(@RequestParam(name = "order") Order order){
    }
}