package com.spring.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootbackend.exception.ResourceNotFoundException;
import com.spring.springbootbackend.model.PatientModel;
import com.spring.springbootbackend.repository.PatientRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PatientController {
	
	@Autowired
	private PatientRepo patientRepo;
	
	@GetMapping("/patients")
	public List<PatientModel> getAllPatients(){
		return patientRepo.findAll();
	}
	
	@PostMapping("/patients")
	public PatientModel createPatient(@RequestBody PatientModel patientModel) {
		return patientRepo.save(patientModel);
	}
	
	@GetMapping("/patients/{id}")
	public ResponseEntity<PatientModel> getPatientById(@PathVariable Long id) {
		PatientModel patientModel = patientRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Patient does not exist with"+id));
		
		return ResponseEntity.ok(patientModel);
	}

}
