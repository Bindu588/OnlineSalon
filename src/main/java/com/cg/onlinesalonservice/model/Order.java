package com.cg.onlinesalonservice.model;

import com.cg.onlinesalonservice.entity.CustomerEntity;

public class Order {
	
	private int orderId;
	private double amount;
	private String billingDate;
	private CustomerEntity customer;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	
}
