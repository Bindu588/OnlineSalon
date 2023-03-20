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
import com.cg.onlinesalonservice.model.Salonservice;
import com.cg.onlinesalonservice.service.ISalonserviceService;


@RestController
public class SalonserviceController {
	
	@Autowired
	private ISalonserviceService salonserviceService;

	@PostMapping("/salonservice/save")
	 public ResponseEntity<Salonservice> addSalonservice(@RequestBody Salonservice salonservice) {
	 Salonservice newSalonservice = salonserviceService.saveSalonservice(salonservice);
	 ResponseEntity<Salonservice> responseEntity = new ResponseEntity<>(newSalonservice,HttpStatus.CREATED);
	 return responseEntity;
	}

	@GetMapping("/salonservice/{salonserviceId}")
     public ResponseEntity<Salonservice> getSalonservice(@PathVariable("salonserviceId") int salonserviceId) {
	 Salonservice salonservice = salonserviceService.findSalonserviceById(salonserviceId);
	 ResponseEntity<Salonservice> responseEntity = new ResponseEntity<>(salonservice,HttpStatus.OK);
	 return responseEntity;
	}
	@GetMapping("/salonservice/all")
     public List<Salonservice> getAllSalonservice() {
	 List<Salonservice> salonservice = salonserviceService.findAllSalonservices();
	 return salonservice;
	}
}
