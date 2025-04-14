package com.example.placement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.placement.entity.Placement;
//passing two parameters in jpa
//1st is the entity name
//2nd is data type of primary key attribute
public interface PlacementReporitory extends JpaRepository<Placement,Integer> {

}
