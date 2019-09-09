package com.springboot.controller;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.internal.matchers.GreaterOrEqual;
import org.mockito.internal.matchers.GreaterThan;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springboot.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {

	
	private MockMvc mvc;
	
	@MockBean
	EmployeeService empService;
	
	@InjectMocks
	EmployeeController empCont;
	
	
	@Before
	public void setup() throws Exception{
		
		mvc = MockMvcBuilders.standaloneSetup(empCont).build();
	}
	
	@Test
	public void EmployeeControllerTest() throws Exception{
		mvc.perform(get("/getAllEmployees"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", Matchers.greaterThan(1)))
			.andExpect(jsonPath("$.*", Matchers.greaterThan(0)));
				
	}
	
	
}
