package com.example.manufacture;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manufacture.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
