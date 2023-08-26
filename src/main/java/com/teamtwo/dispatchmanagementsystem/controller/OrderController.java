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
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        return null;
    }
    @GetMapping("/sent")
    public List<Order> getSentOrders(@RequestParam(name = "sender") String sender){
        Logger logger = LoggerFactory.getLogger(OrderController.class);
        logger.info("get sent orders");
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
