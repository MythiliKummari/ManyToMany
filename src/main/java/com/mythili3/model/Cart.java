package com.mythili3.model;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;

@Entity
@Table(name="cart")
public class Cart {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="cart_id")
	 private int id;
	   
	 @Column(name="product_name")
	 private String name;
	   
	 @ManyToMany
	 @JoinTable(name="cart_product",joinColumns=@JoinColumn(name="cart_id"),
	 inverseJoinColumns=@JoinColumn(name="product_id"))
	 private Set<Products> products=new HashSet<Products>();

	public Cart(int id, String name, Set<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}


}