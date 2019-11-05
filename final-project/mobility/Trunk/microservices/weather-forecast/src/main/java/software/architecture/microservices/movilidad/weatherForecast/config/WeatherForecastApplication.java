package software.architecture.microservices.movilidad.weatherForecast.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackageClasses = {
		software.architecture.microservices.movilidad.weatherForecast.model.WeatherForecast.class
})
@ComponentScan(basePackageClasses = {
		  software.architecture.microservices.movilidad.weatherForecast.api.controller.WeatherForecastApiController.class
		, software.architecture.microservices.movilidad.weatherForecast.service.impl.WeatherForecastServiceImpl.class
})
@EnableJpaRepositories(basePackageClasses = {
		software.architecture.microservices.movilidad.weatherForecast.repository.WeatherForecastRepository.class
})
@SpringBootApplication
@EnableAutoConfiguration
public class WeatherForecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecastApplication.class, args);
	}
}
