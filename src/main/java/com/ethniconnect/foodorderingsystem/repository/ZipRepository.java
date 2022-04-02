package com.ethniconnect.foodorderingsystem.repository;

import com.ethniconnect.foodorderingsystem.entity.Cuisines;
import com.ethniconnect.foodorderingsystem.entity.ZipMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ZipRepository extends JpaRepository<ZipMaster,Long> {

    public ZipMaster getZipMasterByZipCode(String zipCode);


}