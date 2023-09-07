package com.models;


import org.springframework.data.jpa.repository.JpaRepository;
import com.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
