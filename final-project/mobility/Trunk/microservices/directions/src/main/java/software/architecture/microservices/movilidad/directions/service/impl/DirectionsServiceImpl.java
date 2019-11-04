package software.architecture.microservices.movilidad.directions.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.LatLng;

import software.architecture.microservices.movilidad.directions.dto.DirectionsRq;
import software.architecture.microservices.movilidad.directions.dto.DirectionsRs;
import software.architecture.microservices.movilidad.directions.service.DirectionsService;

@Service
public class DirectionsServiceImpl implements DirectionsService {

	@Value("${google.cloud.apiKey}")
	private String API_KEY;
	
	@Override
	public DirectionsRs computeDirection(DirectionsRq directionRq) {
		GeoApiContext geoApiContext = new GeoApiContext.Builder()
				.apiKey(API_KEY)
				.build();
		LatLng originLatLng = new LatLng(directionRq.getOriginLat(), directionRq.getOriginLng());
		LatLng destinationLatLng = new LatLng(directionRq.getDestinationLat(), directionRq.getDestinationLng());
		DirectionsRs directionsRs = new DirectionsRs();
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
		return directionsRs;
	}
	
	@Override
	public List<DirectionsRs> getDirections() {
		// TODO Auto-generated method stub
		return null;
	}
}
