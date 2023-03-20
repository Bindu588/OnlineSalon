package com.cg.onlinesalonservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesalonservice.Exception.ResourceNotFoundException;
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
	
	@Override
	public Order findOrderById(int orderId) {
		Optional<OrderEntity> optionalOrder = orderRepository.findById(orderId);
		if (!optionalOrder.isPresent()) {
			throw new ResourceNotFoundException("Order not existing with id: " + orderId);
		}
		OrderEntity orderEntity = optionalOrder.get();

		// convert order entity to order model
		Order order = new Order();
		BeanUtils.copyProperties(orderEntity, order);

		return order;
	}
	
	@Override
	public List<Order> findAllOrders() {
		 
		List<OrderEntity> orderEntities = orderRepository.findAll();
		
		//convert order entity list to order list
		List<Order> orders = new ArrayList<>();
		
		orderEntities.forEach(oentity-> {
			Order order = new Order();
			BeanUtils.copyProperties(oentity, order);
			orders.add(order);
		});		
		
		return orders;
	}
}
