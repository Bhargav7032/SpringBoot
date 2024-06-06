package com.ciq.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.ciq.entity.Product;
import com.ciq.repository.ProductRepositroy;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductDao {
	
@Autowired
 ProductRepositroy productRepositroy;

@Test
@Rollback(false)
public void testcreatedRead() {
	Product product=new Product();
	product.setPname("flite");
	product.setPcost(100000.00);
	product =   productRepositroy.save(product);
	System.out.println(product);
	
	assertThat(product.getPid()).isGreaterThan(0);
    
	Product findOneProduct = productRepositroy.findById(product.getPid()).get();
	
	assertThat(findOneProduct.getPname()).isEqualTo("flite");
	assertThat(findOneProduct.getPcost()).isEqualTo(100000.00);
	
	productRepositroy.delete(findOneProduct);
	
    assertThat( productRepositroy.findById(product.getPid())).isEmpty();
	
}
}
