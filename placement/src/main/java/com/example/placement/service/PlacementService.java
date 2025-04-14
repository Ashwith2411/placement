package com.example.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placement.entity.Placement;
import com.example.placement.repository.PlacementReporitory;

@Service
public class PlacementService {
	@Autowired
	private PlacementReporitory prepo;
		
	//add data
	public Placement addPlace(Placement place) {
		return prepo.save(place);
	}
	//delete data
	public void deletePlacement(int id) {
		//pre-defined method
		 prepo.deleteById(id);
	}
	//get data
	public List<Placement>getPlacement() {
		//pre-defined method
		return prepo.findAll();
	}

//update data
	//update from table set col1 = val1, col2=val2 where condition;
	public Placement updatePlacement(Placement place) {
		//used int for getting id to int
		//by default it is geting long
		Integer pid = (int)place.getId();
		Placement place1 = prepo.findById(pid).get();
		return prepo.save(place1);
	}
	//update data
//	public Placement updatePlacment(Placement place) {
//		Integer placeid = (int) place.getId();
//		
//		Placement place1 = prepo.findById(placeid).get();
//		place1.setPname(place.getName());
//		return prepo.save(place1);
//		
//	}

}
