package com.vehicle.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Users extends JpaRepository<Users, Long> {
	Optional<Users> findByEmailAndPassword(String email,String password);
}
