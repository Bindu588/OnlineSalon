package com.cg.onlinesalonservice.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.Exception.ResourceNotFoundException;
import com.cg.onlinesalonservice.entity.AppointmentEntity;
import com.cg.onlinesalonservice.model.Appointment;

import com.cg.onlinesalonservice.repository.IAppointmentRepository;


@Service
public class AppointmentService implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepository;
	
	@Override
	public Appointment saveAppointment(Appointment appointment) {
		
		//convert appointment model to appointment entity
		AppointmentEntity appointmentEntity=new AppointmentEntity();
		BeanUtils.copyProperties(appointment, appointmentEntity);
		
		AppointmentEntity newAppointmentEntity=appointmentRepository.save(appointmentEntity);
		
		//convert appointment entity to appointment model
		Appointment newAppointment = new Appointment();
		BeanUtils.copyProperties(newAppointmentEntity, newAppointment);
		
		return newAppointment;
	}
	@Override
	public Appointment findAppointmentById(int appointmentId) {
		java.util.Optional<AppointmentEntity> optionalAppointment = appointmentRepository.findById(appointmentId);
		if (!optionalAppointment.isPresent()) {
			throw new ResourceNotFoundException("Appointment not existing with id: " + appointmentId);
		}
		AppointmentEntity appointmentEntity = optionalAppointment.get();

		// convert appointment entity to appointment model
		Appointment appointment = new Appointment();
		BeanUtils.copyProperties(appointmentEntity, appointment);

		return appointment;
	}

	@Override
	public List<Appointment> findAllAppointments() {
		 
		List<AppointmentEntity> appointmentEntities = appointmentRepository.findAll();
		
		//convert appointment entity list to appointment list
		List<Appointment> appointments = new ArrayList<>();
		
		appointmentEntities.forEach(pentity-> {
			Appointment appointment = new Appointment();
			BeanUtils.copyProperties(pentity, appointment);
			appointments.add(appointment);
		});		
		
		return appointments;
	}
}
	
	

