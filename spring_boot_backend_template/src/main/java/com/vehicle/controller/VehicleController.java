package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.customexception.ResourceNotFoundException;
import com.vehicle.dto.VehicleDto;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicle")

public class VehicleController {
	
	@Autowired 
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<?> addVehicle(@RequestBody VehicleDto dto){
		
		try {
			return ResponseEntity.ok(vehicleService.addVehicle(dto));
		}
		catch(RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ResourceNotFoundException("vehicle not added"));
		}
		
	}
	
	

}
