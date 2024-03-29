package com.example.NewRevice.contronller;

import java.util.List;

public class Contronller {

    public List<Order> getAllOrders(){
        List<Order> list = orderRepositoty.findAll();
        for (Order o: list){
            User user = restTemplate.getForObject("http://localhost:8084/api/v3/users/"+o.getId(), User.class );
            o.setUser(user);
        }
        return list;
    }
}
