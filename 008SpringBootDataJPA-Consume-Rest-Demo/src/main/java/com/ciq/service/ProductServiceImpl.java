package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Product;
import com.ciq.repository.ProductRepositroy;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepositroy productRepositroy;


	@Override
	public void save(Product product) {

		productRepositroy.save(product);
	}

	@Override
	public void update(Product Product) {
		productRepositroy.save(Product);
		
	}

	@Override
	public List<Product> findAll() {
		return productRepositroy.findAll();
	}

	@Override
	public Product findbyid(Integer pid) {
		Product product = null;

		Optional<Product> optional = productRepositroy.findById(pid);

		if (optional.isPresent()) {
			product = optional.get();
		}

		return product;
	}

	

	@Override
	public void DeleteById(Integer pid) {
		productRepositroy.deleteById(pid);
	}

}
