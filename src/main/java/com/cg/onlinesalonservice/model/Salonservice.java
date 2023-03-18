package com.cg.onlinesalonservice.model;

import java.util.List;
import com.cg.onlinesalonservice.entity.AppointmentEntity;


public class Salonservice {

	private int salonServiceId;
	private String salonServiceName;
	private String salonServicePrice;
	private String salonServiceduration;
	private int discount;
    private List<AppointmentEntity> appointments;

	public int getSalonServiceId() {
		return salonServiceId;
	}

	public void setSalonServiceId(int salonServiceId) {
		this.salonServiceId = salonServiceId;
	}

	public String getSalonServiceName() {
		return salonServiceName;
	}

	public void setSalonServiceName(String salonServiceName) {
		this.salonServiceName = salonServiceName;
	}

	public String getSalonServicePrice() {
		return salonServicePrice;
	}

	public void setSalonServicePrice(String salonServicePrice) {
		this.salonServicePrice = salonServicePrice;
	}

	public String getSalonServiceduration() {
		return salonServiceduration;
	}

	public void setSalonServiceduration(String salonServiceduration) {
		this.salonServiceduration = salonServiceduration;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}
	
    
}