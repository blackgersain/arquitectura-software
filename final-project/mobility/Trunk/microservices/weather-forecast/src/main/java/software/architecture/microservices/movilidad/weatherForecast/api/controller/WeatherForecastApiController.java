package software.architecture.microservices.movilidad.weatherForecast.api.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import software.architecture.microservices.movilidad.weatherForecast.api.WeatherForecastApi;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRq;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastSiataRs;
import software.architecture.microservices.movilidad.weatherForecast.service.WeatherForecastService;

@RestController
public class WeatherForecastApiController implements WeatherForecastApi {
 
	@Autowired
	private WeatherForecastService weatherForecastSvc;
	
	@Override
	public ResponseEntity<WeatherForecastSiataRs> postWeatherForecast(@Valid @RequestBody(required = true) WeatherForecastRq weatherForecastRq) {
		 return ResponseEntity.ok(weatherForecastSvc.computeWeatherForecast(weatherForecastRq));
	}
	
	@Override
	public ResponseEntity<List<WeatherForecastRs>> getWeatherForecast() {
		 return ResponseEntity.ok(weatherForecastSvc.getWeatherForecast());
	}
}
