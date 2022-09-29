package com.example.json.resttemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	Integer id;
	String name;
	
	@JsonProperty("contact_phone")
	String contactPhone;
	
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
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
}
