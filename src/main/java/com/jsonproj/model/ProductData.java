package com.jsonproj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductData {
	private Product product;
	@JsonIgnore 
	private String bcaproduct;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getBcaproduct() {
		return bcaproduct;
	}
	public void setBcaproduct(String bcaproduct) {
		this.bcaproduct = bcaproduct;
	}
	

}
