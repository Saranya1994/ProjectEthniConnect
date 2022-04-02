package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Chefs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ChefRepository extends JpaRepository<Chefs,Long> {


    public Set<Chefs> getChefsByChefZipAndCuisines_CuisineId(String zipCode , long cuisineId);

}