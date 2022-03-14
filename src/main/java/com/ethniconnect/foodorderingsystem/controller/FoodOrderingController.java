package com.ethniconnect.foodorderingsystem.controller;

import com.ethniconnect.foodorderingsystem.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FoodOrderingController {
   @Autowired
   Response response;
   @GetMapping("/getCuisines/{zipCode}")
   public Response getCuisines(@PathVariable int zipCode) {
     response.setCuisines(Arrays.asList(new Cuisines(1, "Italian"),
             new Cuisines(2, "Mexican")));
     response.setZipCode(zipCode);
      return response;
   }
    @PostMapping("/getChefs")
    public Response getChefsByCuisineId(@RequestBody ChefRequest chefRequest) {
        response.setChefs(Arrays.asList(new Chefs(1,"Enrique Olvera","3133357573",
                        "10 years","Since Feb 2020",
                         new ChefAddress("3039 Debra Ct","",48326,"Auburn Hills",
                                 "MI"))));
        return response;
    }
  /*@PostMapping("/getMenu")
    public Response getMenuByChefId(@RequestBody MenuRequest menuRequest) {
        response.setMenu(Arrays.asList(new Menu("Monday","Breakfast",
                        (List<Dish>) new Dish("Cheese Omlette", 5.99)),
        new Menu ("Monday","Breakfast", (List<Dish>) new Dish("Spring Roll", 5.99)),
        new Menu ("Monday","Dinner", (List<Dish>) new Dish("Shrimp Soup",4.99))));
        return response;
    }*/
}
