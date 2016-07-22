package model;

import java.sql.Time;

/*
 * Travels Model Object.
 * <P>Contains various attributes of Travels and their getter setters.</p>
 * 
 * @author Anupriya-Ideas2It
 * @version 1.0
 */
public class Travels {
	private int id;
	private String name;
	private String address;
	private double contactNumber;
	private User createdBy;
	private Time createdAt;
	private User modifiedBy;
	private Time modifiedAt; 
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}
	public User getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Time getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Time modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Time getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Travels [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

}
