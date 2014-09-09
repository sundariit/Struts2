package com.java.dao;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table (name="Product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column (name="productid")
	private int productid;
	
	@Column (name="name", nullable = true)
	private String name;
	
	@Column (name="price", nullable = true)
	private int price;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
