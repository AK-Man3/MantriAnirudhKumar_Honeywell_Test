package com.honeywell.test.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Component
public class Passenger {
	
	@JsonProperty
	List<TrainDetails> trainDetails;

	public List<TrainDetails> getTrainDetails() {
		return trainDetails;
	}

	public void setTrainDetails(List<TrainDetails> trainDetails) {
		this.trainDetails = trainDetails;
	}
}
