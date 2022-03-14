package com.ethniconnect.foodorderingsystem.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuRequest {
    private int zipCode;
    private int cuisineId;
    private int chefId;
}
