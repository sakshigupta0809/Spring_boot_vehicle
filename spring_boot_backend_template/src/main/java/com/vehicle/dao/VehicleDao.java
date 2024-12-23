package com.vehicle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.entites.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Long>{

}
