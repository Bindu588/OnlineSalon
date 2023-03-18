package com.cg.onlinesalonservice.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class SalonserviceEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int salonServiceId;
	private String salonServiceName;
	private String salonServicePrice;
	private String salonServiceduration;
	private int discount;
	
	@ManyToMany (mappedBy="appointmentService")
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
