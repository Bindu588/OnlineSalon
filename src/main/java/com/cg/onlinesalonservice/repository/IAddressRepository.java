package com.cg.onlinesalonservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinesalonservice.entity.AddressEntity;

public interface IAddressRepository extends JpaRepository<AddressEntity, Integer> {

}
