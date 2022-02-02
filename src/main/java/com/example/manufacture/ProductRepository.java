package com.example.manufacture;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manufacture.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
