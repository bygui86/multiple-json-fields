package com.rabbit.samples.multiplejsonfields;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbit.samples.multiplejsonfields.domain.JacksonWeather;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author Matteo Baiguini
 * matteo@solidarchitectures.com
 * 19 Mar 2019
 */
public class JacksonUnitTest {

	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void official() throws Exception {

		JacksonWeather weather = mapper.readValue("{\n"
				+ "  \"location\": \"London\",\n"
				+ "  \"temp\": 15,\n"
				+ "  \"weather\": \"Cloudy\"\n"
				+ "}", JacksonWeather.class);

		assertEquals("London", weather.getLocation());
		assertEquals("Cloudy", weather.getOutlook());
		assertEquals(15, weather.getTemp());
	}

	@Test
	public void alternative() throws Exception {

		JacksonWeather weather = mapper.readValue("{\n"
				+ "  \"place\": \"Lisbon\",\n"
				+ "  \"temperature\": 35,\n"
				+ "  \"outlook\": \"Sunny\"\n"
				+ "}", JacksonWeather.class);

		assertEquals("Lisbon", weather.getLocation());
		assertEquals("Sunny", weather.getOutlook());
		assertEquals(35, weather.getTemp());
	}

}
