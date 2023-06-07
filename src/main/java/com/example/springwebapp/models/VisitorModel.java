package com.example.springwebapp.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "visitors")
@Data
public class VisitorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "visitor_name")
    String name;
    @Column(name = "visitor_age")
    int age;
    @Column(name = "visitor_phone")
    String phone;
    @Column(name = "visitor_quest")
    String quest;
}
