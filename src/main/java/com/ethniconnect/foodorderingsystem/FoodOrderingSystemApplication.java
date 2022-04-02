package com.ethniconnect.foodorderingsystem;

import com.ethniconnect.foodorderingsystem.entity.*;
import com.ethniconnect.foodorderingsystem.repository.ChefRepository;
import com.ethniconnect.foodorderingsystem.repository.CuisineRepository;
import com.ethniconnect.foodorderingsystem.repository.MenuRepository;
import com.ethniconnect.foodorderingsystem.repository.ZipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FoodOrderingSystemApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingSystemApplication.class, args);
	}
	@Autowired
	ZipRepository zipRepository;
	@Autowired
	CuisineRepository cuisineRepository;
	@Autowired
	ChefRepository chefRepository;
	@Autowired
	MenuRepository menuRepository;
	@Override
	public void run(String... args) throws Exception {
	/*	ZipMaster zip = new ZipMaster();
		zip.setZipCodeId(1);
		zip.setZipCode("10010");
		zipRepository.save(zip);
		Cuisines cuisines = new Cuisines();
		cuisines.setCuisineId(1);
		cuisines.setCuisineName("Mexican");
		cuisines.setZipMaster(zip);
		cuisineRepository.save(cuisines);*/
	/*	Cuisines cuisines = new Cuisines();
		cuisines.setCuisineId(1);
		cuisines.setCuisineName("Japanese");
		//cuisines.setZipMaster(zip);
		Chefs chefs = new Chefs(
				1,"Tony","3156357573","Address1","Address2",
				"Detroit","10010",cuisines);
		chefRepository.save(chefs);
		(Arrays.asList(new Menu(1,"Monday","Breakfast",Arrays.asList(new Dish(1,"Cheese Omlette",5.99),
				new Dish(2,"Tortillas",3.99)))))
		// Menu menu = new Menu();
		//menu.setMenuId(1);
		menu.setDay("Monday");
		List<Dish> dishList = new ArrayList<>();
		Dish dish1 = new Dish();
	//	dish1.setDishId(1);
		dish1.setDishName("Chicken Cheese Burger");
		dish1.setDishPrice(12);
		dishList.add(dish1);
		menu.setDish(dishList);
		menu.setMenuType("Dinner");
		Chefs chefs = new Chefs();
		chefs.setChefId(17);
		menuRepository.save(menu);*/

	}
}
