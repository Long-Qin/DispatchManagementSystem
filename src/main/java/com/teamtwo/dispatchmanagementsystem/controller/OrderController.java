package com.teamtwo.dispatchmanagementsystem.controller;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import com.teamtwo.dispatchmanagementsystem.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("/{id}")
    public Order getOrder(@PathVariable(name = "id") Long id){
        return null;
    }
    @GetMapping ("/{sender}/sent")
    public List<Long> getSentOrders(@PathVariable(name = "sender") String sender){
        return orderService.getOrderBySender(sender);
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
