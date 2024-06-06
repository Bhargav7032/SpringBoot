package com.ciq.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.controller.ProductController;
import com.ciq.entity.Product;
import com.ciq.model.ResponseObj;

@SpringBootTest
public class ProductIntegerationTest {
	
	@Autowired
	private ProductController productController;
	
	@Test
    public void testCreateReadDelete() {
    	Product product=new Product();
    	product.setPid(503);
    	product.setPname("bus");
    	product.setPcost(1000000.00);
    	ResponseObj responseObj = productController.save(product);
		assertEquals(200, responseObj.getStatusCode());
		Product productObj = (Product) responseObj.getResult();
		assertEquals("bus", productObj.getPname());
    	
    
		  //findbyid//
	Product productread=(Product) productController.findById(productObj.getPid()).getResult();
	assertEquals("bus",productread.getPname());
	assertEquals(1000000.00,productread.getPcost() );
	
	
	  //Deletedbyid//
	responseObj=productController.deleteById(productObj.getPid());
	assertEquals("Deleted Successflly", responseObj.getResult().toString());
	
	}
}
