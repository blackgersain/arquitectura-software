package software.architecture.microservices.movilidad.weatherForecast.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastSiataRs implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8797758999804955599L;

	@JsonAlias({"descProbabilidadOrigen"})
	private String description;
	
	@JsonAlias({"urlIconoTiempoOrigen"})
	private String originUrlIcon;
	
	@JsonAlias({"urlIconoProbabilidadOrigen"})
	private String destinationUrlIcon;
	
	private String status;
	private String message;

	public WeatherForecastSiataRs() {}

	public WeatherForecastSiataRs(
			  String description
			, String originUrlIcon
			, String destinationUrlIcon
			, String status
			, String message) 
	{
		super();
		this.description = description;
		this.originUrlIcon = originUrlIcon;
		this.destinationUrlIcon = destinationUrlIcon;
		this.status = status;
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOriginUrlIcon() {
		return originUrlIcon;
	}

	public void setOriginUrlIcon(String originUrlIcon) {
		this.originUrlIcon = originUrlIcon;
	}

	public String getDestinationUrlIcon() {
		return destinationUrlIcon;
	}

	public void setDestinationUrlIcon(String destinationUrlIcon) {
		this.destinationUrlIcon = destinationUrlIcon;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
