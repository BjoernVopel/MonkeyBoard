package org.monkey.monkeyboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String grad;
	private String griffe;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
	
	
}
