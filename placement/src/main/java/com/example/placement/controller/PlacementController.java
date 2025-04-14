package com.example.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placement.entity.Placement;
import com.example.placement.service.PlacementService;

@RestController
//Mapping(to pass data using http protocol)
//get,post,delete,put
public class PlacementController {
	@Autowired
	private PlacementService ser;
	
	@PostMapping("/add")
	
	public Placement addPalce(@RequestBody Placement place) {
		return ser.addPlace(place);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteplace(@PathVariable  Integer id) {
		ser.deletePlacement(id);
	}
	@GetMapping("/get")
	public List<Placement> getPlacement(@RequestBody Placement place) {
		return ser.getPlacement();
	}
	@PutMapping("/update") 
	public Placement updatePlacement(@RequestBody Placement place) {
		return ser.updatePlacement(place);
	}
	

}
