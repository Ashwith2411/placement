package com.example.placement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.placement.entity.Placement;
//passing two parameters in jpa
//
public interface PlacementReporitory extends JpaRepository<Placement,Integer> {

}
