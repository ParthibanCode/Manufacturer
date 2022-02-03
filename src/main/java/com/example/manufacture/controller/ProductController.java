package com.example.manufacture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.manufacture.entity.Product;
import com.example.manufacture.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService prdService;

	@PostMapping("/{id}/product")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addProductwithComponent(@RequestBody Product p1, @PathVariable Integer id) {
		prdService.addProduct(p1, id);
	}
}
