package com.ethniconnect.foodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="zip_master")
public class ZipMaster {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="zip_id")
    private long zipCodeId;
    @Column(name="zip_code")
    private String zipCode;
    @OneToMany(fetch = FetchType.EAGER)
    Set<Cuisines> cuisines;

}