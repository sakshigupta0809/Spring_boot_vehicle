package com.vehicle.service;

import com.vehicle.dto.ApiResponse;
import com.vehicle.dto.VehicleDto;
import com.vehicle.entites.Vehicle;


public interface VehicleService {
	
	
	ApiResponse addVehicle(VehicleDto dto);
}
