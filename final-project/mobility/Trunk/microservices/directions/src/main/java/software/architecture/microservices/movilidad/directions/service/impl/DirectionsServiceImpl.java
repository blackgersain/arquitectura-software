package software.architecture.microservices.movilidad.directions.service.impl;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.LatLng;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;
import software.architecture.microservices.movilidad.directions.dto.DirectionsGoogleRs;
import software.architecture.microservices.movilidad.directions.model.Directions;
import software.architecture.microservices.movilidad.directions.repository.DirectionsRepository;
import software.architecture.microservices.movilidad.directions.service.DirectionsService;

@Service
public class DirectionsServiceImpl implements DirectionsService {

	@Value("${google.cloud.apiKey}")
	private String API_KEY;
	
	@Autowired
	private DirectionsRepository directionsDao;
	
	@Override
	public DirectionsGoogleRs computeDirection(DirectionsRq directionRq) {
		GeoApiContext geoApiContext = new GeoApiContext.Builder()
				.apiKey(API_KEY)
				.build();
		LatLng originLatLng = new LatLng(directionRq.getOriginLat(), directionRq.getOriginLng());
		LatLng destinationLatLng = new LatLng(directionRq.getDestinationLat(), directionRq.getDestinationLng());
		DirectionsGoogleRs directionsRs = new DirectionsGoogleRs();
		try {
			DirectionsResult directionsResult = DirectionsApi.newRequest(geoApiContext)
				.language("es")
				.origin(originLatLng)
				.destination(destinationLatLng)
				.await();
			directionsRs.setDirectionsResult(directionsResult);
			directionsRs.setStatus("Okay");
		} 
		catch (ApiException | InterruptedException | IOException e) {
			directionsRs.setStatus("Exception");
			directionsRs.setMessage(e.getMessage());
			e.printStackTrace();
		}
		saveDirection(directionRq);
		return directionsRs;
	}
	
	@Override
	public List<DirectionsRs> getDirections() {
		return directionsDao.findAllAsDto();
	}
	
	private void saveDirection(DirectionsRq directionRq) {
		Directions directions = new Directions();
		directions.setOriginLat(directionRq.getOriginLat());
		directions.setOriginLng(directionRq.getOriginLng());
		directions.setDestinationLat(directionRq.getDestinationLat());
		directions.setDestinationLng(directionRq.getDestinationLng());
		directions.setDateTime(LocalDateTime.now());
		directionsDao.save(directions);
	}
}
