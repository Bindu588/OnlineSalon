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

import com.cg.onlinesalonservice.model.Customer;
import com.cg.onlinesalonservice.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/customer/save")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		Customer newCustomer = customerService.saveCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(newCustomer,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/customer/{customerId}")
	public  ResponseEntity<Customer>  getCustomer(@PathVariable("customerId") int customerId) {
		Customer customer = customerService.findCustomerById(customerId);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer,HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/customer/all")
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerService.findAllCustomers();
		return customers;
	}
	
}
