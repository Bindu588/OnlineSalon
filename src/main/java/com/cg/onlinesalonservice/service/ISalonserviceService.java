package com.cg.onlinesalonservice.service;
import java.util.List;

import com.cg.onlinesalonservice.model.Salonservice;


public interface ISalonserviceService {
	public Salonservice saveSalonservice(Salonservice salonservice);

	public Salonservice findSalonserviceById(int salonserviceId);

	public List<Salonservice> findAllSalonservices();

}