package com.hw3.model.vo;

import java.util.concurrent.CountDownLatch;

import com.hw3.controller.ProductController;

public class Product {

	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public Product(){}
	
	public Product(int pId, String pName, int price, double tax){
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		
		
	}
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		String str = pId + "번 " + pName + "제품의 가격은 " + price + 
				"원이고 세금은 " + tax + "입니다";
		
		return str;
	}
	

	
	
	
	
}
