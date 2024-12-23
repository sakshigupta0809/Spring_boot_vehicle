package com.vehicle.customexception;

public class ResourceNotFoundException extends RuntimeException{
	
	String msg;
	public ResourceNotFoundException(String msg){
		this.msg = msg;
	}

}
