package com.example.Oder.repositories;

import com.example.Oder.models.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoty extends JpaRepository<Order, Long> {
}
