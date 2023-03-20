package com.cg.onlinesalonservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.Exception.ResourceNotFoundException;
import com.cg.onlinesalonservice.entity.CustomerEntity;
import com.cg.onlinesalonservice.model.Customer;
import com.cg.onlinesalonservice.repository.ICustomerRepository;
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		// convert customer model to customer entity
		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customer, customerEntity);

		CustomerEntity newCustomerEntity = customerRepository.save(customerEntity);

		//convert customer entity to customer model
		Customer newCustomer = new Customer();
		BeanUtils.copyProperties(newCustomerEntity, newCustomer);
		
		return newCustomer;
	}
	@Override
	public Customer findCustomerById(int customerId) {
		Optional<CustomerEntity> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isPresent()) {
			throw new ResourceNotFoundException("Customer not existing with id: " + customerId);
		}
		CustomerEntity customerEntity = optionalCustomer.get();
		
		//convert customer entity to customer model
		Customer customer = new Customer();
		BeanUtils.copyProperties(customerEntity, customer);
		
		return customer;
	}
	
	
	@Override
	public List<Customer> findAllCustomers(){
		List<CustomerEntity> customerEntities = customerRepository.findAll();
		
		//convert customer entity list to customer list
		List<Customer> customers = new ArrayList<>();
		
		customerEntities.forEach(centity->{
			Customer customer = new Customer();
			BeanUtils.copyProperties(centity, customer);
			customers.add(customer);
		});
		return customers;
	}
}
