package com.ethniconnect.foodorderingsystem.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ChefAddress {
    private String address1;
    private String address2;
    private int zipCode;
    private String city;
    private String state;
}
