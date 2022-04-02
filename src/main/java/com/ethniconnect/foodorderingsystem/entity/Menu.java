package com.ethniconnect.foodorderingsystem.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="menu_details")
public class Menu {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long menuId;
    private String day;
    private String menuType;

    @OneToMany
    @JoinColumn(name = "menuId")
    private List<Dish> dish;

    @OneToOne
    @JoinColumn(name = "chef_id")
    Chefs chef;

}