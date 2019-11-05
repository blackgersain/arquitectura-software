package software.architecture.microservices.movilidad.weatherForecast.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs;
import software.architecture.microservices.movilidad.weatherForecast.model.WeatherForecast;

public interface WeatherForecastRepository extends CrudRepository<WeatherForecast, Long> {

	@Query("SELECT new software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs"  
			+ "(wf.originLat, wf.originLng, wf.destinationLat, wf.destinationLng, wf.dateTime, wf.originDateTime, wf.destinationDateTime)"
			+ " FROM WeatherForecast wf")
	List<WeatherForecastRs> findAllAsDto();
}