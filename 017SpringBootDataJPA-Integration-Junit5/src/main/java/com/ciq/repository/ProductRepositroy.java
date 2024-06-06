package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciq.entity.Product;

public interface ProductRepositroy  extends JpaRepository<Product, Integer>{

}
