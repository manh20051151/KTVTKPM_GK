package com.example.Oder.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_name")
    private  String name;

    @OneToOne
    private Subject subject;

    public Order(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
