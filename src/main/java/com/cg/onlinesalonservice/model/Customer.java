package com.cg.onlinesalonservice.model;

import java.util.List;
import com.cg.onlinesalonservice.entity.AddressEntity;
import com.cg.onlinesalonservice.entity.AppointmentEntity;
import com.cg.onlinesalonservice.entity.OrderEntity;

public class Customer {
	
	private int customerId;
	private String name;
	private String email;
	private String password;
	private String contactNo;
	private int age;
	
	
	private AddressEntity address;
	
	
	private List<AppointmentEntity> appointments;
	
	
	private List<OrderEntity> orders;


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public AddressEntity getAddress() {
		return address;
	}


	public void setAddress(AddressEntity address) {
		this.address = address;
	}


	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}


	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}


	public List<OrderEntity> getOrders() {
		return orders;
	}


	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
	
	
	
	

}
