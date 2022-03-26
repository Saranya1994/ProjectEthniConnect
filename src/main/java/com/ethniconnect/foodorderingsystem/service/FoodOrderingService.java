package com.ethniconnect.foodorderingsystem.service;

import com.ethniconnect.foodorderingsystem.api.ChefRequest;
import com.ethniconnect.foodorderingsystem.api.MenuRequest;
import com.ethniconnect.foodorderingsystem.api.Response;
import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.repository.CuisineRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FoodOrderingService {
    public Response getCuisines(int zipCode) {
    }

    public Response getChefsByCuisineId(ChefRequest chefRequest) {
    }

    public Response getMenuByChefId(MenuRequest menuRequest) {
    }

    @Override
    public List<Cuisines> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public <S extends Cuisines> List<S> saveAll(Iterable<S> entities) {
        return null;
    }
}