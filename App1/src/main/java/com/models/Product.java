package com.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


public class Product {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private double weight;
	    
	    // Getters
	    public Long getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    // Setters
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }
	    
	    
	    
}
