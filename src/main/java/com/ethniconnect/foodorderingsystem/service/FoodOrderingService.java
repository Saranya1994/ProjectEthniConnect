package com.ethniconnect.foodorderingsystem.service;

import com.ethniconnect.foodorderingsystem.api.ChefRequest;
import com.ethniconnect.foodorderingsystem.api.MenuRequest;
import com.ethniconnect.foodorderingsystem.api.Response;
import com.ethniconnect.foodorderingsystem.entity.Chefs;
import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.Menu;
import com.ethniconnect.foodorderingsystem.entity.ZipMaster;
import com.ethniconnect.foodorderingsystem.repository.ChefRepository;
import com.ethniconnect.foodorderingsystem.repository.CuisineRepository;
import com.ethniconnect.foodorderingsystem.repository.MenuRepository;
import com.ethniconnect.foodorderingsystem.repository.ZipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

@Service
public class FoodOrderingService {

    @Autowired
    ZipRepository zipRepository;

    @Autowired
    CuisineRepository cuisineRepository;

    @Autowired
    ChefRepository chefRepository;

    @Autowired
    MenuRepository menuRepository;

    public ZipMaster getCuisinesByZip(String zipCode){
        return zipRepository.getZipMasterByZipCode(zipCode);
    }

    public Set<Cuisines> getCuisinesByZipMaster(String zipCode) {
        return cuisineRepository.getCuisinesByZipMaster_ZipCode(zipCode);
    }
    public Set<Chefs> getChefsByChefZipAndCuisines_CuisineName(String zipCode, long cuisineId) {
        return  chefRepository.getChefsByChefZipAndCuisines_CuisineId(zipCode,cuisineId);
    }

    public List<Menu> getMenuByChef_ChefId(long chefId) {
        return  menuRepository.getMenuByChef_ChefId(chefId);
    }

}