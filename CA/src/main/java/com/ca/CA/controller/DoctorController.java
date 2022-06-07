package com.ca.CA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.CA.exception.ResourceNotFoundException;
import com.ca.CA.model.Doctor;
import com.ca.CA.repository.DoctorRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	//get all patients	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		return doctorRepository.findAll();
	}
	
	//get doctor by id rest api
	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> getPatientById(@PathVariable Long id) {
		Doctor doc=doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor Does not Exist with ID: "+id));
		return ResponseEntity.ok(doc);
	}
}
