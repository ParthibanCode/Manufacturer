package com.example.manufacture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manufacture.ComponentRepository;
import com.example.manufacture.SupplierRepository;
import com.example.manufacture.entity.Component;
import com.example.manufacture.entity.Supplier;

@Service
public class ComponentService {
	
	@Autowired
	ComponentRepository compRepo;
	@Autowired
	SupplierRepository supplierRepo;
	
	public void addComponent(Component component) {
		compRepo.save(component);
	}
	
	public void addSupplier(Supplier supplier) {
		supplierRepo.save(supplier);
	}
	
	public void addSupplierWithId(Supplier supplier, Integer Id) {
		Component c1 = compRepo.findById(Id).get();
		c1.getSuppliers().add(supplier);
		compRepo.save(c1);
	}

}
