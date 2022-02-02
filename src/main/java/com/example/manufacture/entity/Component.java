package com.example.manufacture.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Component {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer component_id;
	private String name;
	private String description;
	private Product products;
	private Supplier suppliers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public Integer getComponent_id() {
		return component_id;
	}

	public void setComponent_id(Integer component_id) {
		this.component_id = component_id;
	}

	public Supplier getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Supplier suppliers) {
		this.suppliers = suppliers;
	}

}
