package software.architecture.microservices.movilidad.weatherForecast.service;

import java.util.List;

import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRq;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastSiataRs;

public interface WeatherForecastService {

	WeatherForecastSiataRs computeWeatherForecast(WeatherForecastRq weatherForecastRq);
	
	List<WeatherForecastRs> getWeatherForecast();
}
