package com.ethniconnect.foodorderingsystem.api;

import com.ethniconnect.foodorderingsystem.entity.Chefs;
import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Response {
    private String zipCode;
    private Set<Cuisines> cuisines;
    private Set<Chefs> chefs;
    private List<Menu> menu;

}
