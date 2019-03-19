package com.rabbit.samples.multiplejsonfields.controllers;

import com.rabbit.samples.multiplejsonfields.domain.GsonWeather;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/gson/weather")
public class GsonWeatherController {

	@PostMapping
	public GsonWeather post(
			@RequestBody final GsonWeather weather) {

		log.info("Gson weather: {}", weather);

		return weather;
	}

}
