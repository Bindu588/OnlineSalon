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

import com.cg.onlinesalonservice.model.Address;
import com.cg.onlinesalonservice.service.IAddressService;

@RestController
public class AddressController {

	@Autowired
	private IAddressService addressService;
	
	@PostMapping("/address/save")
	public ResponseEntity<Address> addAddress(@RequestBody Address address) {
		Address newAddress = addressService.saveAddress(address);
		ResponseEntity<Address> responseEntity = new ResponseEntity<>(newAddress,HttpStatus.CREATED);
		return responseEntity;		
	}
	
	@GetMapping("/address/{addressId}")
	public  ResponseEntity<Address>  getAddress(@PathVariable("addressId") int addressId) {
		Address address = addressService.findAddressById(addressId);
		ResponseEntity<Address> responseEntity = new ResponseEntity<>(address,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/address/all")
	public List<Address> getAllAddress() {
		List<Address> addresses = addressService.findAllAddresses();
		return addresses;
	}
}
