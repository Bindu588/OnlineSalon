package com.cg.onlinesalonservice.model;

import java.util.List;
import com.cg.onlinesalonservice.entity.CustomerEntity;
import com.cg.onlinesalonservice.entity.SalonserviceEntity;

public class Appointment {
	
	private int appointmentId;
	private String location;
	private String visitType;
	private String preferredDate;
	private String preferredTime;
	private String status;
    private List<SalonserviceEntity> appointmentService;
	private CustomerEntity customer;
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public String getPreferredDate() {
		return preferredDate;
	}
	public void setPreferredDate(String preferredDate) {
		this.preferredDate = preferredDate;
	}
	public String getPreferredTime() {
		return preferredTime;
	}
	public void setPreferredTime(String preferredTime) {
		this.preferredTime = preferredTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<SalonserviceEntity> getAppointmentService() {
		return appointmentService;
	}
	public void setAppointmentService(List<SalonserviceEntity> appointmentService) {
		this.appointmentService = appointmentService;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	

}
