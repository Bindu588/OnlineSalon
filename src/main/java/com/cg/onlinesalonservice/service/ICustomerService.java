package com.cg.onlinesalonservice.service;

import java.util.List;

import com.cg.onlinesalonservice.model.Customer;

public interface ICustomerService {

	public Customer saveCustomer(Customer customer);
	
	public Customer findCustomerById(int customerId);
	
	public List<Customer> findAllCustomers();

}