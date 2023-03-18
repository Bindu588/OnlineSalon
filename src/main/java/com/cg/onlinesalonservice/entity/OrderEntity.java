package com.cg.onlinesalonservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int orderId;
	private double amount;
	private String billingDate;
	
	
	@ManyToOne
	@JoinColumn(name="customerId")
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
