package com.vehicle.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersDto extends BaseDto {

	@NotBlank
	private String userName;
	
	@NotBlank
	private String email;
	
	@NotBlank
	@Range(min = 6,max = 6)
	private String password;
	
	@NotBlank
	private String city;
	
	@NotBlank
	@Range(min = 10)
	private int contact;
	
	@NotBlank
	private LocalDate dob;
	
	
}
