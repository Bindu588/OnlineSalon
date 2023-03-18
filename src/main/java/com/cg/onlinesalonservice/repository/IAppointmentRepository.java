package com.cg.onlinesalonservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinesalonservice.entity.AppointmentEntity;

public interface IAppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

}
