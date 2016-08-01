package com.i2i.model;

import java.util.Set;
import java.util.HashSet;
import java.sql.Date;
import java.sql.Time;
/*
 * City Model Object.
 * <P>Contains various attributes of City and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class City {
	private int id;
	private String name;
	private User createdBy;
	private Date createdAt;
	private User modifiedBy;
	private Date modifiedAt; 
	private Set<Route> sourceCityRoutes = new HashSet<Route>();
	private Set<Route> destinationCityRoutes = new HashSet<Route>();
	
	public City() {
		
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

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Set<Route> getSourceCityRoutes() {
		return sourceCityRoutes;
	}

	public void setSourceCityRoutes(Set<Route> sourceCityRoutes) {
		this.sourceCityRoutes = sourceCityRoutes;
	}

	public Set<Route> getDestinationCityRoutes() {
		return destinationCityRoutes;
	}

	public void setDestinationCityRoutes(Set<Route> destinationCityRoutes) {
		this.destinationCityRoutes = destinationCityRoutes;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
    
	
}
