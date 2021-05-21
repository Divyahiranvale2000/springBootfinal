package com.example.divya.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RfidData {
	
	@Id
	private int tagId;
	private String name;
	private String vehicle_no;
	private String material;
	private String company_name;
	private String company_contact;
	
	
	
	//constuctor\
	public RfidData(int tagId, String name, String vehicle_no, String material, String company_name,
			String company_contact) {
		super();
		this.tagId = tagId;
		this.name = name;
		this.vehicle_no = vehicle_no;
		this.material = material;
		this.company_name = company_name;
		this.company_contact = company_contact;
	}


	//default constructor

	public RfidData() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getters and setters	

	public int getTagId() {
		return tagId;
	}


	public void setTagId(int tagId) {
		this.tagId = tagId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVehicle_no() {
		return vehicle_no;
	}


	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public String getCompany_contact() {
		return company_contact;
	}


	public void setCompany_contact(String company_contact) {
		this.company_contact = company_contact;
	}

	//to string  method

	@Override
	public String toString() {
		return "RfidData [tagId=" + tagId + ", name=" + name + ", vehicle_no=" + vehicle_no + ", material=" + material
				+ ", company_name=" + company_name + ", company_contact=" + company_contact + "]";
	}	
	
		
	
	
}
