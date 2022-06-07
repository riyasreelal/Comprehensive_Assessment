package com.ca.CA.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.CA.exception.ResourceNotFoundException;
import com.ca.CA.model.Patients;
import com.ca.CA.repository.PatientRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	//get all patients	
	@GetMapping("/patients")
	public List<Patients> getAllPatients(){
		return patientRepository.findAll();
	}
	
	//create patient rest api
	@PostMapping("/patients")
	public Patients createPatient(@RequestBody Patients patient) {
		return patientRepository.save(patient);
	}
	
	//get patient by id rest api
	@GetMapping("/patients/{id}")
	public ResponseEntity<Patients> getPatientById(@PathVariable Long id) {
		Patients patient=patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Does not Exist with ID: "+id));
		return ResponseEntity.ok(patient);
	}
	
	//update patient rest api
	@PutMapping("/patients/{id}")
	public ResponseEntity<Patients> updatePatient(@PathVariable Long id, @RequestBody Patients patientDetails){
		
		Patients patient=patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Does not Exist with ID: "+id));
		
		patient.setName(patientDetails.getName());
		patient.setAge(patientDetails.getAge());
		patient.setDateOfVisit(patientDetails.getDateOfVisit());
		patient.setVisited_doctor(patientDetails.getVisited_doctor());
		patient.setPresc(patientDetails.getPresc());
		
		Patients updatedPatient = patientRepository.save(patient);
		
		return ResponseEntity.ok(updatedPatient);
	}
	
	//delete patient REST api
	@DeleteMapping("/patients/{id}")
	public ResponseEntity<Map<String, Boolean>> deletePatient(@PathVariable Long id){
		
		Patients patient=patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Does not Exist with ID: "+id));
		
		patientRepository.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
