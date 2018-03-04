package org.monkey.monkeyboard.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String grad;
	private String griffe;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "username")
	private User user;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrad() {
		return grad;
	}
	
	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public String getGriffe() {
		return griffe;
	}
	
	public void setGriffe(String griffe) {
		this.griffe = griffe;
	}
	
	public void setUser(User user){
    	this.user = user;
    }
    
    public User getUser(){
    	return this.user;
    }
	
	
}
