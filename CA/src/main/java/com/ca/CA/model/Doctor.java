package com.ca.CA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "DocName")
	private String name;
	
	@Column(name= "Age")
	private int age;	
	
	@Column(name= "Gender")
	private char gen;
	
	@Column(name= "Specialist")
	private String specialist;
	
	public Doctor() {
		
	}	
	
	public Doctor(String name, int age, char gen, String specialist) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.specialist = specialist;
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
	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	
}
