package com.honeywell.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.honeywell.test.model.Passenger;
import com.honeywell.test.model.TrainDetails;


@Service
public class TrainDashboardService {

	public ResponseEntity<Passenger> getTrainDetails() {
		var td1 = new TrainDetails();
		td1.setArrivalTime("10:30 AM");
		td1.setPlatformNumber("5");
		td1.setTrainName("Delhi Express");
		var td2 = new TrainDetails();
		td2.setArrivalTime("11:00 PM");
		td2.setPlatformNumber("12");
		td2.setTrainName("Hyderabad Express");
		Passenger passenger = new Passenger();
		List<TrainDetails> trainDetailsList = new ArrayList<TrainDetails>();
		trainDetailsList.add(td1);
		trainDetailsList.add(td2);
		passenger.setTrainDetails(trainDetailsList);
		return ResponseEntity.ok().body(passenger);
	}

	public ResponseEntity<TrainDetails> addTrainDetails(TrainDetails trainDetails) {
		var td = new TrainDetails();
		td.setArrivalTime(trainDetails.getArrivalTime());
		td.setPlatformNumber(trainDetails.getPlatformNumber());
		td.setTrainName(trainDetails.getTrainName());
		return ResponseEntity.ok().body(td);
	}
}
