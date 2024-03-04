package com.spring.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootbackend.model.PatientModel;

@Repository
public interface PatientRepo extends JpaRepository<PatientModel, Long>{

}
