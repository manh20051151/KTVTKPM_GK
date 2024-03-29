package com.example.Oder.services;

import com.example.Oder.models.Order;
import com.example.Oder.models.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Oder.repositories.OrderRepositoty;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderSevice {
    private final OrderRepositoty orderRepositoty;
    private final RestTemplate restTemplate;
    @Autowired
    public OrderSevice(OrderRepositoty orderRepositoty, RestTemplate restTemplate) {
        this.orderRepositoty = orderRepositoty;
        this.restTemplate = restTemplate;
    }

    public List<Order> getAllOrders(){
       List<Order> list = orderRepositoty.findAll();
        for (Order o: list){
            Subject subject = restTemplate.getForObject("http://localhost:8083/api/v1/subjects/"+o.getId(), Subject.class );
            o.setSubject(subject);
        }
        return list;
    }


//    public Order getOrderId(long id){
//        Order order = orderRepositoty.findById(id).get();
//        Subject subject = restTemplate.getForObject("http://localhost:8084/api/v3/users/"+order.getId(), Subject.class );
//        order.setSubject(subject);
//        return order;
//    }

    public Order addOrder(Order order){
        return orderRepositoty.save(order);
    }

    public void deleteOrder(long id){
        orderRepositoty.deleteById(id);
    }
//
//    public Order getOrderId(long id) {
//    }
}
