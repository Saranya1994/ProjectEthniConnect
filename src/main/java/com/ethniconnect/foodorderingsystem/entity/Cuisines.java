package com.ethniconnect.foodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cuisine_categories")
public class Cuisines {
    @Id
   private Integer cuisineId;
    private String cuisineName;

}
