package com.spring.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class DoctorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "doc_name")
	private String name;
	
	@Column(name = "doc_age")
	private int age;
	
	@Column(name = "doc_gender")
	private String gender;
	
	@Column(name="doc_specialist_feild")
	private String specialist_feild;
	
	public DoctorModel() {
		
	}
	
	public DoctorModel(String name, int age, String gender, String specialist_feild) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist_feild=specialist_feild;
	}
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getSpecialist_feild() {
		return specialist_feild;
	}

	public void setSpecialist_feild(String specialist_feild) {
		this.specialist_feild = specialist_feild;
	}
	

}
