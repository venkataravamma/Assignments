package com.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adhar_details")
public class Adhar {
	
 @Id
 @Column(name="adhar_id")
 private int adharId;
 @Column(length=100 ,name="adhar_name")
 private String adharName;
 @Column(length=200,name="adhar_address")
 private String adharAddress;
public int getAdharId() {
	return adharId;
}
public void setAdharId(int adharId) {
	this.adharId = adharId;
}
public String getAdharName() {
	return adharName;
}
public void setAdharName(String adharName) {
	this.adharName = adharName;
}
public String getAdharAddress() {
	return adharAddress;
}
public void setAdharAddress(String adharAddress) {
	this.adharAddress = adharAddress;
}
public Adhar(int adharId, String adharName, String adharAddress) {
	super();
	this.adharId = adharId;
	this.adharName = adharName;
	this.adharAddress = adharAddress;
}
public Adhar() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
