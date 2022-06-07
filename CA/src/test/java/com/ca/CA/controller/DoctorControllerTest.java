package com.ca.CA.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.mockito.InjectMocks;

@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private DoctorController doctorController;
	
	@Before
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(doctorController).build();
		
	}
	
	@Test
	public void testDoctorController() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/doctors")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
