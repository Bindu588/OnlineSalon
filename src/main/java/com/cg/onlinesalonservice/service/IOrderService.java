package com.cg.onlinesalonservice.service;

import java.util.List;

import com.cg.onlinesalonservice.model.Order;

public interface IOrderService {

	public Order saveOrder(Order order);

	public Order findOrderById(int orderId);

	public List<Order> findAllOrders();

}
