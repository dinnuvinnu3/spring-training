package com.example.DbsProducer.dto;

public class Order {

	private String orderId;
	private String name;
	private int qnty;
	private int price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, String name, int qnty, int price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.qnty = qnty;
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
