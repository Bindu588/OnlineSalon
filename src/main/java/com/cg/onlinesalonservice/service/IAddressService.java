package com.cg.onlinesalonservice.service;

import java.util.List;

import com.cg.onlinesalonservice.model.Address;

public interface IAddressService {

	public Address saveAddress(Address address);

	public Address findAddressById(int addressId);

	public List<Address> findAllAddresses();
	

}
