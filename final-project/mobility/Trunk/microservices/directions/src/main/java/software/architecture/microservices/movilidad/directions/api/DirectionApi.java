package software.architecture.microservices.movilidad.directions.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;

public interface DirectionApi {

	 @RequestMapping(value = "/directions",
		        produces = { "application/json", "application/xml" }, 
		        consumes = { "application/json", "application/xml" },
		        method = RequestMethod.POST)
		    ResponseEntity<DirectionsRs> postDirections(DirectionsRq directionsRq);
		    
	 @RequestMapping(value = "/directions",
		        produces = { "application/json", "application/xml" }, 
		        consumes = { "application/json", "application/xml" },
		        method = RequestMethod.GET)
		    ResponseEntity<List<DirectionsRs>> getDirections(); 
}
