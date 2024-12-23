package com.vehicle.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicle.dao.VehicleDao;
import com.vehicle.dto.ApiResponse;
import com.vehicle.dto.VehicleDto;
import com.vehicle.entites.Vehicle;
@Service
@Transactional
public class VehicleServiceImple implements VehicleService {

	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private ModelMapper mapper;



	
	@Override
	public ApiResponse addVehicle(VehicleDto dto) {
		Vehicle vehicleEntity = mapper.map(dto, Vehicle.class);
		
		Vehicle vehiclePersistent = vehicleDao.save(vehicleEntity);		
		
		return (new ApiResponse("Vehicle added successfully"));
	}
	
	
	
	

}
