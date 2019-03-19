package com.rabbit.samples.multiplejsonfields;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rabbit.samples.multiplejsonfields.domain.GsonWeather;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author Matteo Baiguini
 * matteo@solidarchitectures.com
 * 19 Mar 2019
 */
public class GsonUnitTest {

	Gson gson = new GsonBuilder().create();

	@Test
	public void official() {

		GsonWeather weather = gson.fromJson("{\n"
				+ "  \"location\": \"London\",\n"
				+ "  \"temp\": 15,\n"
				+ "  \"weather\": \"Cloudy\"\n"
				+ "}", GsonWeather.class);

		assertEquals("London", weather.getLocation());
		assertEquals("Cloudy", weather.getOutlook());
		assertEquals(15, weather.getTemp());
	}

	@Test
	public void alternative() {

		final GsonWeather weather = gson.fromJson("{\n"
				+ "  \"place\": \"Lisbon\",\n"
				+ "  \"temperature\": 35,\n"
				+ "  \"outlook\": \"Sunny\"\n"
				+ "}", GsonWeather.class);

		assertEquals("Lisbon", weather.getLocation());
		assertEquals("Sunny", weather.getOutlook());
		assertEquals(35, weather.getTemp());
	}

}
