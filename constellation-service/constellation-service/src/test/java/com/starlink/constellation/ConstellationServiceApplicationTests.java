package com.starlink.constellation;

import com.google.gson.Gson;
import com.starlink.constellation.controller.ConstellationController;
import com.starlink.constellation.entity.Constellation;
import com.starlink.constellation.service.ConstellationService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ConstellationController.class)
class ConstellationServiceApplicationTests {


	@Autowired
	MockMvc mvc;
	@MockBean
	ConstellationService constellationService;

	@Test
	public void addConstellationsTest() throws Exception {

		Constellation constellation = new Constellation(1L, "Alpha","A1");

		Gson gson = new Gson();
		String jsonString = gson.toJson(constellation);

		mvc.perform(post("/constellations/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonString))
				.andExpect(status().isOk());
	}

	@Test
	public void findByConstellationIdTest() throws Exception {

		mvc.perform(get("/constellations/1"))
				.andExpect(status().isOk());
	}

	@Test
	public void allconstellationsTest() throws Exception {

		mvc.perform(get("/constellations/allconstellations"))
				.andExpect(status().isOk());
	}



	@Test
	void contextLoads() {

	}

}
