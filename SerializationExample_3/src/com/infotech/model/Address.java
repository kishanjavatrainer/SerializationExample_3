package com.infotech.model;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = -7800233291437691948L;
	private int id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private long zipCode;
	
	public Address(int id, String addressLine1, String addressLine2, String city, long zipCode) {
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.zipCode = zipCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", zipCode=" + zipCode + "]";
	}
}
