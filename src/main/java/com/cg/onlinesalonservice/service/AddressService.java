package com.cg.onlinesalonservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.Exception.ResourceNotFoundException;
import com.cg.onlinesalonservice.entity.AddressEntity;
import com.cg.onlinesalonservice.model.Address;
import com.cg.onlinesalonservice.repository.IAddressRepository;

@Service
public class AddressService implements IAddressService{

	@Autowired
	private IAddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		
		//convert address model to address entity
		AddressEntity addressEntity=new AddressEntity();
		BeanUtils.copyProperties(address, addressEntity);
		
		AddressEntity newAddressEntity=addressRepository.save(addressEntity);
		
		//convert address entity to address model
		Address newAddress = new Address();
		BeanUtils.copyProperties(newAddressEntity, newAddress);
		
		return newAddress;
	}
	
	@Override
	public Address findAddressById(int addressId) {
		Optional<AddressEntity> optionalAddress = addressRepository.findById(addressId);
		if (!optionalAddress.isPresent()) {
			throw new ResourceNotFoundException("Address not existing with id: " + addressId);
		}
		AddressEntity addressEntity = optionalAddress.get();

		// convert address entity to address model
		Address address = new Address();
		BeanUtils.copyProperties(addressEntity, address);

		return address;
	}
	
	@Override
	public List<Address> findAllAddresses() {
		 
		List<AddressEntity> addressEntities = addressRepository.findAll();
		
		//convert address entity list to address list
		List<Address> addresses = new ArrayList<>();
		
		addressEntities.forEach(aentity-> {
			Address address = new Address();
			BeanUtils.copyProperties(aentity, address);
			addresses.add(address);
		});		
		
		return addresses;
	}
}
