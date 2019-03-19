package com.rabbit.samples.multiplejsonfields.controllers;

import com.rabbit.samples.multiplejsonfields.domain.JacksonWeather;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/jackson/weather")
public class JacksonWeatherController {

	@PostMapping
	public JacksonWeather post(
			@RequestBody final JacksonWeather weather) {

		log.info("Jackson weather: {}", weather);

		return weather;
	}

}
