package com.starlink.satelliteservice;

import com.google.gson.Gson;
import com.starlink.satelliteservice.controller.SatelliteController;
import com.starlink.satelliteservice.entity.Satellite;
import com.starlink.satelliteservice.service.SatelliteService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SatelliteController.class)
class SatelliteServiceApplicationTests {

	@Autowired
	MockMvc mvc;
	@MockBean
	SatelliteService satelliteService;

	@Test
	public void saveSatelliteTest() throws Exception {

		Satellite satellite = new Satellite(1L, "Sat1","S1",1L);

		Gson gson = new Gson();
		String jsonString = gson.toJson(satellite);

		mvc.perform(post("/satellites/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonString))
				.andExpect(status().isOk());
	}

	@Test
	public void getSatelliteWithConstellationTest() throws Exception {

		Satellite satellite = new Satellite(1L, "Sat1","S1",1L);

		mvc.perform(get("/satellites/1"))
				.andExpect(status().isOk());
	}

	@Test
	public void deleteSatelliteWithConstellationTest() throws Exception {

		Satellite satellite = new Satellite(1L, "Sat1","S1",1L);

		mvc.perform(MockMvcRequestBuilders.delete("/satellites/1"))
				.andExpect(status().isOk());
	}

	@Test
	void contextLoads() {
	}



}
