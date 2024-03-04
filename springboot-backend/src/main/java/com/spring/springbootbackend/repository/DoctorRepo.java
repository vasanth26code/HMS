package com.spring.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootbackend.model.DoctorModel;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorModel, Long>{
	

}
