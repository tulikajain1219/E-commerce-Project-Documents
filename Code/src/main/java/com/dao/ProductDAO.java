package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer>{

	public int countByProductId(int productId);

	
}
