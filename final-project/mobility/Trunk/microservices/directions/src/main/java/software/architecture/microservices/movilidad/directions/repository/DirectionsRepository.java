package software.architecture.microservices.movilidad.directions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;
import software.architecture.microservices.movilidad.directions.model.Directions;

public interface DirectionsRepository extends CrudRepository<Directions, Long> {

	@Query("SELECT new software.architecture.microservices.movilidad.directions.dto.DirectionsRs"  
			+ "(d.originLat, d.originLng, d.destinationLat, d.destinationLng, d.dateTime)"
			+ " FROM Directions d")
	List<DirectionsRs> findAllAsDto();
}
