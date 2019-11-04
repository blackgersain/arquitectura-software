package software.architecture.microservices.movilidad.directions.service;

import java.util.List;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;

public interface DirectionsService {

	DirectionsRs computeDirection(DirectionsRq directionRq);
	
	List<DirectionsRs> getDirections();
}
