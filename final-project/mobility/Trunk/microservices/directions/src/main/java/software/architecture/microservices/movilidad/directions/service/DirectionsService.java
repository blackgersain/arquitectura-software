package software.architecture.microservices.movilidad.directions.service;

import java.util.List;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;
import software.architecture.microservices.movilidad.directions.dto.DirectionsGoogleRs;

public interface DirectionsService {

	DirectionsGoogleRs computeDirection(DirectionsRq directionRq);
	
	List<DirectionsRs> getDirections();
}
