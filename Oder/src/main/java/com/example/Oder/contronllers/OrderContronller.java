package com.example.Oder.contronllers;

import com.example.Oder.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import com.example.Oder.services.OrderSevice;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class OrderContronller {
    @Autowired
    private OrderSevice orderSevice;

    @GetMapping("/orders")
    public List<Order> getAlOrders(){
        return orderSevice.getAllOrders();
    }


    @GetMapping("/orders/{id}")
    public Order getUserById(@PathVariable(value = "id") long id){
        return orderSevice.getOrderId(id);
    }

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order) {
        return orderSevice.addOrder(order);
    }

}
