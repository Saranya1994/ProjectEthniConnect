package com.ethniconnect.foodorderingsystem.service;

import com.ethniconnect.foodorderingsystem.api.ChefRequest;
import com.ethniconnect.foodorderingsystem.api.MenuRequest;
import com.ethniconnect.foodorderingsystem.api.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FoodOrderingService {
    public Response getCuisines(int zipCode) {


    }


    public Response getChefsByCuisineId(ChefRequest chefRequest) {
    }

    public Response getMenuByChefId(MenuRequest menuRequest) {
    }
}