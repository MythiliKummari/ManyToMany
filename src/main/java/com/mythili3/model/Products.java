package com.mythili3.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")

public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	   
	@Column(name="product_name")
	private String Name;
	   
	@ManyToMany(mappedBy="products")
	private Set<Cart> products=new HashSet<Cart>();
	
    public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String name, Set<Cart> products) {
		super();
		this.id = id;
		Name = name;
		this.products = products;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<Cart> getProducts() {
		return products;
	}

	public void setProducts(Set<Cart> products) {
		this.products = products;
	}

}