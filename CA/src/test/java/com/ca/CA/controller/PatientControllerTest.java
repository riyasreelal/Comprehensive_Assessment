package com.ca.CA.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class PatientControllerTest {
private MockMvc mockMvc;
	
	@InjectMocks
	private PatientController patientController;
	
	@Before
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
		
	}
	
	@Test
	public void testDoctorController() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/patients")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
