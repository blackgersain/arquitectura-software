package software.architecture.microservices.movilidad.weatherForecast.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRq;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastRs;
import software.architecture.microservices.movilidad.weatherForecast.dto.WeatherForecastSiataRs;
import software.architecture.microservices.movilidad.weatherForecast.model.WeatherForecast;
import software.architecture.microservices.movilidad.weatherForecast.repository.WeatherForecastRepository;
import software.architecture.microservices.movilidad.weatherForecast.service.WeatherForecastService;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

	@Value("${datasource.bearer}")
	private String API_BEARER;
	
	@Value("${siata.forecast.url}")
	private String URL_FORECAST;
	
	@Autowired
	private WeatherForecastRepository weatherForecastDao;
	
	@Override
	public WeatherForecastSiataRs computeWeatherForecast(WeatherForecastRq weatherForecastRq) {
		final String url = buildUrlForecast(weatherForecastRq);
		RestTemplate restTemplate = new RestTemplateBuilder()
				.defaultHeader("Authorization", API_BEARER)
				.build();
		WeatherForecastSiataRs weatherForecastSiataRs = new WeatherForecastSiataRs();
		try {
			weatherForecastSiataRs = restTemplate.getForObject(url, WeatherForecastSiataRs.class);
			weatherForecastSiataRs.setStatus("Okay");
		}
		catch (RestClientException e) {
			weatherForecastSiataRs.setStatus("Exception");
			weatherForecastSiataRs.setMessage(e.getMessage());
			e.printStackTrace();
		}
		saveWeatherForecast(weatherForecastRq);
		return weatherForecastSiataRs;
	}
	
	@Override
	public List<WeatherForecastRs> getWeatherForecast() {
		return weatherForecastDao.findAllAsDto();
	}
	
	private String buildUrlForecast(WeatherForecastRq weatherForecastRq) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String url = "/" + LocalDateTime.now().format(dateTimeFormatter)
				+ "/" + weatherForecastRq.getOriginDateTime()
				+ "/" + weatherForecastRq.getOriginLng()
				+ "/" + weatherForecastRq.getOriginLat()
				+ "/" + weatherForecastRq.getDestinationDateTime()
				+ "/" + weatherForecastRq.getDestinationLng()
				+ "/" + weatherForecastRq.getDestinationLat();
		url = url.replace('T', ' ');
		return URL_FORECAST + url;
	}
	
	private void saveWeatherForecast(WeatherForecastRq weatherForecastRq) {
		WeatherForecast weatherForecast = new WeatherForecast();
		weatherForecast.setOriginLat(weatherForecastRq.getOriginLat());
		weatherForecast.setOriginLng(weatherForecastRq.getOriginLng());
		weatherForecast.setDestinationLat(weatherForecastRq.getDestinationLat());
		weatherForecast.setDestinationLng(weatherForecastRq.getDestinationLng());
		weatherForecast.setDateTime(LocalDateTime.now());
		weatherForecast.setOriginDateTime(weatherForecastRq.getOriginDateTime());
		weatherForecast.setDestinationDateTime(weatherForecastRq.getDestinationDateTime());
		weatherForecastDao.save(weatherForecast);
	}
}
