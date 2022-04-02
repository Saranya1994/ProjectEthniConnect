package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Chefs;
import com.ethniconnect.foodorderingsystem.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {


    public List<Menu> getMenuByChef_ChefId(long chefId);

}
