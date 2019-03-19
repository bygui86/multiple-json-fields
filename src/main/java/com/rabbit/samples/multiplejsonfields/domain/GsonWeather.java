package com.rabbit.samples.multiplejsonfields.domain;

import com.google.gson.annotations.SerializedName;

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
public class GsonWeather {

	@SerializedName(value="location", alternate="place")
	String location;

	@SerializedName(value="temp", alternate="temperature")
	int temp;
 
	@SerializedName(value="outlook", alternate="weather")
	String outlook;

}
