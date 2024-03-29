package com.example.Oder.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subjects")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "Subject_SubId")
    private long SubId;
    @Column(name = "Subject_Name")
    private String Name;
    @Column(name = "Subject_Credit")
    private  String Credit;




}
