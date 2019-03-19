package com.rabbit.samples.multiplejsonfields.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class JacksonWeather {

	@JsonProperty("location")
	@JsonAlias("place")
	String location;

	@JsonProperty("temp")
	@JsonAlias("temperature")
	int temp;
	 
	@JsonProperty("outlook")
	@JsonAlias("weather")
	String outlook;

}
