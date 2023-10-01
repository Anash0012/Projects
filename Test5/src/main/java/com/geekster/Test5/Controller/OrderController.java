package com.geekster.Test5.Controller;

import com.geekster.Test5.Model.Order;
import com.geekster.Test5.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder (@RequestBody Order order){
        orderService.addOrder(order);
    }

    @GetMapping("order/{Id}")
    public Optional<Order> getorder(@PathVariable Integer Id){
        return orderService.getorderbyid(Id);
    }
}