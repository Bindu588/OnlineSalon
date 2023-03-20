package com.cg.onlinesalonservice.service;

import java.util.List;

import com.cg.onlinesalonservice.model.Appointment;

public interface IAppointmentService {

	public Appointment saveAppointment(Appointment appointment);

	public Appointment findAppointmentById(int appointmentId);
	
	public List<Appointment> findAllAppointments();


}
