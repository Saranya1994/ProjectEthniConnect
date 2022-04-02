package com.ethniconnect.foodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="cuisine_categories")
public class Cuisines {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cuisine_id")
    private long cuisineId;

    @Column(name="cuisine_name")
    private String cuisineName;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="zip_id")
    ZipMaster zipMaster;

    @OneToMany(fetch = FetchType.EAGER)
    Set<Chefs> chefs;

    public Cuisines(String cuisineName,ZipMaster zipMaster) {
        this.cuisineName = cuisineName;
        this.zipMaster =zipMaster;
    }


}