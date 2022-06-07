package com.ca.CA.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "patients")
public class Patients {
	
	@Id 
	@GeneratedValue (strategy = GenerationType .IDENTITY)
	private long id;
	
	@Column (name="PatName")
	private String name;
	
	@Column (name="Age")
	private int age;
	
	@Column (name="Visited_Doc")
	private String visited_doctor;

	@Column (name="date_of_visit")
	private Date dateOfVisit;
	
	@Column (name="Prescription")
	private String presc;
	
	public Patients() {
		
	}
	
	public Patients(String name, int age, String visited_doctor, Date dateOfVisit, String presc) {
		super();
		this.name = name;
		this.age = age;
		this.visited_doctor = visited_doctor;
		this.dateOfVisit = dateOfVisit;
		this.presc = presc;
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
	public String getVisited_doctor() {
		return visited_doctor;
	}
	public void setVisited_doctor(String visited_doctor) {
		this.visited_doctor = visited_doctor;
	}
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getPresc() {
		return presc;
	}
	public void setPresc(String presc) {
		this.presc = presc;
	}
	
	
	
}
