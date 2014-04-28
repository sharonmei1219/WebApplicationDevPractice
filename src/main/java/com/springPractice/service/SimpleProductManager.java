package com.springPractice.service;

import java.util.List;

import com.springPractice.domain.Product;

public class SimpleProductManager implements ProductManager {

	private List<Product> products;

	public void increasePrice(int percentage) {
		if(products == null) return;
		
		for(Product product : products){
			double newPrice = product.getPrice() * (100 + percentage)/100;
			product.setPrice(newPrice);
		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}