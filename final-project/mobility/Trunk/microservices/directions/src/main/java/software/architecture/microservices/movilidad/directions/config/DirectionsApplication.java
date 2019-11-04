package software.architecture.microservices.movilidad.directions.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackageClasses = {
		software.architecture.microservices.movilidad.directions.model.Directions.class
})
@ComponentScan(basePackageClasses = {
		  software.architecture.microservices.movilidad.directions.api.controller.DirectionApiController.class
		, software.architecture.microservices.movilidad.directions.service.DirectionsService.class
})
@EnableJpaRepositories(basePackageClasses = {
		software.architecture.microservices.movilidad.directions.repository.DirectionsRepository.class
})
@SpringBootApplication
@EnableAutoConfiguration
public class DirectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectionsApplication.class, args);
	}
}
