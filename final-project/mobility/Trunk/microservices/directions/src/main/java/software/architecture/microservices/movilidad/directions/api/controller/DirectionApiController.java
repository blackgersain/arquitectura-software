package software.architecture.microservices.movilidad.directions.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import software.architecture.microservices.movilidad.directions.api.DirectionApi;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;
import software.architecture.microservices.movilidad.directions.service.DirectionsService;

@RestController
public class DirectionApiController implements DirectionApi {
 
	@Autowired
	private DirectionsService directionsSvc;
	
	@Override
	public ResponseEntity<DirectionsRs> postDirections(@Valid @RequestBody(required = true) DirectionsRq directionsRq) {
		 return ResponseEntity.ok(directionsSvc.computeDirection(directionsRq));
	}
	
	@Override
	public ResponseEntity<List<DirectionsRs>> getDirections() {
		 return ResponseEntity.ok(directionsSvc.getDirections());
	}
}
