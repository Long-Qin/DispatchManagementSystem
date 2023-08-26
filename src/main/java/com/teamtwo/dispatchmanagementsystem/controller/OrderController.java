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

}
