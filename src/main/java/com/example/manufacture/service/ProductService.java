package com.example.manufacture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manufacture.ComponentRepository;
import com.example.manufacture.ProductRepository;
import com.example.manufacture.entity.Component;
import com.example.manufacture.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	ComponentRepository componentRepository;

	public void addProduct(Product product, Component component) {
		product.getComponents().add(component);
		productRepository.save(product);
	}

	public void addProduct(Product product, Integer compId) {
		Component c1 = componentRepository.findById(compId).get();
		product.getComponents().add(c1);
		productRepository.save(product);
	}

}
