package software.architecture.microservices.movilidad.weatherForecast.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRq;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastSiataRs;

public interface WeatherForecastApi {

	@RequestMapping(value = "/weatherForecast",
	        produces = { "application/json", "application/xml" }, 
	        consumes = { "application/json", "application/xml" },
	        method = RequestMethod.POST)
	    ResponseEntity<WeatherForecastSiataRs> postWeatherForecast(WeatherForecastRq weatherForecastRq);
	
	 @RequestMapping(value = "/weatherForecast",
		        produces = { "application/json", "application/xml" }, 
		        consumes = { "application/json", "application/xml" },
		        method = RequestMethod.GET)
		    ResponseEntity<List<WeatherForecastRs>> getWeatherForecast(); 
}
