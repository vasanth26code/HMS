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
import com.spring.springbootbackend.model.DoctorModel;
import com.spring.springbootbackend.repository.DoctorRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class DoctorController {
	
	@Autowired
	private DoctorRepo doctorRepo;

	//get all doctors
	@GetMapping("/doctors")
	public List<DoctorModel> getAllDoctors(){
		return doctorRepo.findAll();
	}
	
	//create doctor rest api
	@PostMapping("/doctors")
	public DoctorModel createDoctor(@RequestBody DoctorModel doctorModel) {
		return doctorRepo.save(doctorModel);
	}
	
	//getDoctor by name
	@GetMapping("/doctors/{id}")
	public ResponseEntity<DoctorModel> getDoctorById(@PathVariable Long id) {
		
		DoctorModel doctorModel = doctorRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor does not exist with"+id));
		
		return ResponseEntity.ok(doctorModel);
	}
}
