package com.example.manufacture.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Component {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer component_id;
	@NotBlank
	private String name;
	@NotNull
	private String description;
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST})
	@JoinTable(name = "Components_in_Product", joinColumns = {
			@JoinColumn(name = "component_ID") }, inverseJoinColumns = { @JoinColumn(name = "prd_ID") })
	private Set<Product> products = new HashSet<>();
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST})
	@JoinTable(name = "Suppliers_of_Components", joinColumns = {
			@JoinColumn(name = "component_ID") }, inverseJoinColumns = { @JoinColumn(name = "supplier_ID") })
	private Set<Supplier> suppliers = new HashSet<>();

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

	public Integer getComponent_id() {
		return component_id;
	}

	public void setComponent_id(Integer component_id) {
		this.component_id = component_id;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(HashSet<Product> products) {
		this.products = products;
	}

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(HashSet<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

}
