package com.spring.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.sql.Date;

@Entity
@Table(name = "patients")
public class PatientModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@Column(name = "pat_name")
	private String name;
	
	@Column(name = "pat_visitedDoctor")
	private String visitedDoctor;
	
	@Column(name = "pat_dateOfVisit")
	private String dateOfVisit;
	
	public PatientModel() {
		
	}
	
	public PatientModel(String name, String visitedDoctor, String dateOfVisit) {
		super();
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
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
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	
	
	

}
