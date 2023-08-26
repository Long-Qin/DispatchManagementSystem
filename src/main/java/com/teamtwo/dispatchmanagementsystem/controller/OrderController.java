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
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        return null;
    }
    @GetMapping("/{sender}/sent")
    public List<Order> getSentOrders(@PathVariable String sender){
        return null;
    }
    @GetMapping("/{receiver}/received")
    public List<Order> getReceivedOrders(@PathVariable String receiver){
        return null;
    }

    @PostMapping("/add")
    public Long addOrder(@RequestBody Order order){
        Order newOrder = orderService.add(order);
        return newOrder.getId();
    }
    @PutMapping("/update/{id}")
    public String updateOrder(@PathVariable Long id, @RequestBody String state){
        return "update success";
    }
}
