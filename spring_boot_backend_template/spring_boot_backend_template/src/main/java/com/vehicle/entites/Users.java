package com.vehicle.entites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Users extends BaseEntity{
	
	@Column(length =  30, name = "user_name")
	private String userName;
	
	@Column(length =  30, name = "email")
	private String email;
	
	@Column(length =  6, name = "password")
	private String password;
	
	@Column(length =  30, name = "city")
	private String city;
	
	@Column(length =  10, name = "contact")
	private String contact;
	
	@Column(length =  30, name = "Birth_Date")
	private LocalDate dob;
	
	
	
}

