package com.ethniconnect.foodorderingsystem.api;

import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Response {
    private int zipCode;
    private List<Cuisines> cuisines;
    private List<Chefs> chefs;
    private List<Menu> menu;

}
