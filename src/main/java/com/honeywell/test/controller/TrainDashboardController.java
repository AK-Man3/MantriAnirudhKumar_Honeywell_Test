package com.honeywell.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.test.model.Passenger;
import com.honeywell.test.model.TrainDetails;
import com.honeywell.test.service.TrainDashboardService;

@RestController
@RequestMapping("/api")
public class TrainDashboardController {

	@Autowired
	TrainDashboardService trainDashboardService;
	
	@GetMapping("/trainsList")
	public ResponseEntity<Passenger> passengerView() {
		return trainDashboardService.getTrainDetails();
	}
	
	@PutMapping("/addTrainDetails")
	public ResponseEntity<TrainDetails> stationMasterInput(@RequestBody TrainDetails trainDetails) {
		return trainDashboardService.addTrainDetails(trainDetails);
	}
	
}
