package com.vehicle.dto;

import java.time.LocalDate;

import com.vehicle.entites.Company;
import com.vehicle.entites.Users;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class VehicleDto extends BaseDto {
	
	@NotBlank
	private String vehicleName;
	
	
	private Company company;
	
	@NotBlank
	private String vehicleNumber;
	
	@NotBlank
	private String vehicleType;
	
	@NotBlank
	private LocalDate purchaseDate;
		

}
