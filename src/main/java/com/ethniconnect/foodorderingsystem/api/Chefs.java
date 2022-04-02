package com.ethniconnect.foodorderingsystem.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chefs {
    private long chefId;
    private String chefName;
    private String phoneNumber;
    private String experience;
    private String membership;
    private ChefAddress chefAddress;
}
