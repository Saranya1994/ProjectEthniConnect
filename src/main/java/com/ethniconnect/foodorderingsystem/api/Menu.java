package com.ethniconnect.foodorderingsystem.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private String day;
    private String menuType;
    private List<Dish> dish;
}
