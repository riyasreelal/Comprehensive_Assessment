package com.ca.CA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ca.CA.model.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long>{

}
