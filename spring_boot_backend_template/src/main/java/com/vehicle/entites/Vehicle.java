package com.vehicle.entites;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="vehicles")
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Vehicle extends BaseEntity{
	
	@Column(length =  30, name = "vehicle_name")
	private String vehicleName;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="company")
	private Company company;
	
	@Column(length =  30, name = "vehicle_number", unique = true)
	private String vehicleNumber;
	
	@Column(length =  30, name = "vehicle_type")
	private String vehicleType;
	
	@Column(length =  30, name = "purchaseDate")
	private LocalDate purchaseDate;
	
	@ManyToOne
	@JoinColumn(name="user_id_fk", nullable = false)
	private Users user;
	
}
