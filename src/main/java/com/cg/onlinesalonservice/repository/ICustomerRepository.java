package com.cg.onlinesalonservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinesalonservice.entity.CustomerEntity;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
