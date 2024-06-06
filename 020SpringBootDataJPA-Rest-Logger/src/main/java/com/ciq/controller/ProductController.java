package com.ciq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Product;
import com.ciq.model.ResponseObj;
import com.ciq.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseObj findAll() {
		LOGGER.info("Find All Controller Method Invoke - INFO");
		LOGGER.debug("Find All Controller Method Invoke - DEBUG");
		LOGGER.warn("Find All Controller Method Invoke - WARN");
		LOGGER.error("Find All Controller Method Invoke - ERROR");
		return new ResponseObj(200, productService.findAll());

	}

	@GetMapping("{pid}")
	public ResponseObj findById(@PathVariable("pid") Long pid) {
		return new ResponseObj(200, productService.findById(pid));
	}

	@PostMapping
	public ResponseObj save(@RequestBody Product product) {
		Product produtObj = productService.save(product);
		return new ResponseObj(200, produtObj);

	}

	@PutMapping
	public ResponseObj update(@RequestBody Product product) {
		productService.update(product);
		return new ResponseObj(200, "Updated Successflly");

	}

	@DeleteMapping("{pid}")
	public ResponseObj deleteById(@PathVariable("pid") Long pid) {
		productService.deleteById(pid);
		return new ResponseObj(200, "Deleted Successflly");
	}
}
