package com.cg.onlinesalonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinesalonservice.model.Order;
import com.cg.onlinesalonservice.service.IOrderService;

@RestController
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/order/save")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order newOrder = orderService.saveOrder(order);
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(newOrder,HttpStatus.CREATED);
		return responseEntity;		
	}
	
	@GetMapping("/order/{orderId}")
	public  ResponseEntity<Order>  getOrder(@PathVariable("orderId") int orderId) {
		Order order = orderService.findOrderById(orderId);
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(order,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/order/all")
	public List<Order> getAllOrder() {
		List<Order> orders = orderService.findAllOrders();
		return orders;
	}
}
