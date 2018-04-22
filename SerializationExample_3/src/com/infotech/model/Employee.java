package com.infotech.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -4724957588046435474L;
	private int id;
	private String name;
	private int age;
	private String email;
	
	//transient field can not be the part of Serialization process.
	private transient String password;
	
	private Address address;
	
	public Employee(int id, String name, int age, String email, String password, Address address) {
		System.out.println( "Employee args constructor is called..");
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}
}
