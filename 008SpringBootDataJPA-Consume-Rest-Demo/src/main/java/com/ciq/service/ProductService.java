package com.ciq.service;

import java.util.List;

import com.ciq.entity.Product;

public interface ProductService {
	
	public void save(Product product);
	
	public void update(Product Product);
	
	public List<Product>findAll();
	
	public Product findbyid(Integer pid);
	
	public void DeleteById(Integer pid);

}
