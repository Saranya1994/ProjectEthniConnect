package com.ethniconnect.foodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="chef_details",
        uniqueConstraints= @UniqueConstraint(name = "mobileNumber",
                columnNames="chef_mobile_number"))
public class Chefs {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="chef_id")
    private long chefId;

    @Column(name="chef_name")
    private String chefName;

    @Column(name="chef_mobile_number",
            nullable = false)
    private String chefMobileNumber;

    @Column(name="chef_address1")
    private String chefAddress1;

    @Column(name="chef_address2")
    private String chefAddress2;

    @Column(name="chef_city")
    private String chefCity;

    @Column(name="chef_zip")
    private String chefZip;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cuisine_id")
    Cuisines cuisines;
}