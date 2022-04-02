package com.ethniconnect.foodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dish_details")
public class Dish {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long dishId;
    private String dishName;
    private double dishPrice;
    private String ingredients;
    private String interestingFacts;
}