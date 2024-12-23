package com.vehicle.entites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="users")
@Getter 
@Setter 
@ToString(callSuper = true)
@NoArgsConstructor
public class Users extends BaseEntity{
	
	@Column(length =  30, name = "user_name")
	private String userName;
	
	@Column(length =  30, name = "email")
	private String email;
	
	@Column(length =  20, name = "password")
	private String password;
	
	@Column(length =  30, name = "city")
	private String city;
	
	@Column(length =  10, name = "contact")
	private int contact;
	
	@Column(length =  30, name = "Birth_Date")
	private LocalDate dob;

	public Users(String userName, String email, String password, String city, int contact, LocalDate dob) {
	
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.contact = contact;
		this.dob = dob;
	}
	
	
	
	
	
}

