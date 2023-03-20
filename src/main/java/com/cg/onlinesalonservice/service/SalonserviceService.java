package com.cg.onlinesalonservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.Exception.ResourceNotFoundException;
import com.cg.onlinesalonservice.entity.SalonserviceEntity;
import com.cg.onlinesalonservice.model.Salonservice;
import com.cg.onlinesalonservice.repository.ISalonserviceRepository;

@Service
public class SalonserviceService implements ISalonserviceService {

	@Autowired
	private ISalonserviceRepository salonserviceRepository;

	@Override
	public Salonservice saveSalonservice(Salonservice salonservice) {

		// convert salonservice model to salonservice entity
		SalonserviceEntity salonserviceEntity = new SalonserviceEntity();
		BeanUtils.copyProperties(salonservice, salonserviceEntity);

		SalonserviceEntity newSalonserviceEntity = salonserviceRepository.save(salonserviceEntity);

		// convert product entity to product model
		Salonservice newSalonservice = new Salonservice();
		BeanUtils.copyProperties(newSalonserviceEntity, newSalonservice);

		return newSalonservice;
	}

	@Override
	public Salonservice findSalonserviceById(int salonserviceId) {
		Optional<SalonserviceEntity> optionalSalonservice = salonserviceRepository.findById(salonserviceId);
		if (!optionalSalonservice.isPresent()) {
			throw new ResourceNotFoundException("Salonservice not existing with id: " + salonserviceId);
		}
		SalonserviceEntity salonserviceEntity = optionalSalonservice.get();

		// convert product entity to product model
		Salonservice salonService = new Salonservice();
		BeanUtils.copyProperties(salonserviceEntity, salonService);

		return salonService;
	}

	@Override
	public List<Salonservice> findAllSalonservices() {
		 
		List<SalonserviceEntity> salonserviceEntities = salonserviceRepository.findAll();
		
		//convert product entity list to product list
		List<Salonservice> salonservices = new ArrayList<>();
		
		salonserviceEntities.forEach(sentity-> {
			Salonservice salonservice = new Salonservice();
			BeanUtils.copyProperties(sentity, salonservice);
			salonservices.add(salonservice);
		});		
		
		return salonservices;
	}
}