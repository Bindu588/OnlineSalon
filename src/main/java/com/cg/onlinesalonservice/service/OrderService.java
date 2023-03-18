package com.cg.onlinesalonservice.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.entity.OrderEntity;
import com.cg.onlinesalonservice.model.Order;
import com.cg.onlinesalonservice.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {
	
	@Autowired
	private IOrderRepository orderRepository;
	
	@Override
	public Order saveOrder(Order order) {
		
		//convert order model to order entity
		OrderEntity orderEntity=new OrderEntity();
		BeanUtils.copyProperties(order, orderEntity);
		
		OrderEntity newOrderEntity=orderRepository.save(orderEntity);
		
		//convert order entity to order model
		Order newOrder = new Order();
		BeanUtils.copyProperties(newOrderEntity, newOrder);
		
		return newOrder;
	}
	
}
