package com.cg.onlinesalonservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinesalonservice.model.Appointment;
import com.cg.onlinesalonservice.service.IAppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private IAppointmentService appointmentService;
	
	@PostMapping("/appointment/save")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) {
		Appointment newAppointment = appointmentService.saveAppointment(appointment);
		ResponseEntity<Appointment> responseEntity = new ResponseEntity<>(newAppointment,HttpStatus.CREATED);
		return responseEntity;		
	}
	
	@GetMapping("/appointment/{appointmentId}")
	public  ResponseEntity<Appointment>  getAppointment(@PathVariable("appointmentId") int appointmentId) {
		Appointment appointment = appointmentService.findAppointmentById(appointmentId);
		ResponseEntity<Appointment> responseEntity = new ResponseEntity<>(appointment,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/appointment/all")
	public List<Appointment> getAllAppointments() {
		List<Appointment> appointments = appointmentService.findAllAppointments();
		return appointments;
	}
	
	
}