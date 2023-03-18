package com.cg.onlinesalonservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinesalonservice.entity.OrderEntity;

public interface IOrderRepository extends JpaRepository<OrderEntity, Integer> {

}
