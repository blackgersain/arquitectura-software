package software.architecture.microservices.movilidad.weatherForecast.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WeatherForecastRq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6666301656732348696L;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime originDateTime;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime destinationDateTime;
	
	@NotNull
	private Double originLat;
	
	@NotNull
	private Double originLng;
	
	@NotNull
	private Double destinationLat;
	
	@NotNull
	private Double destinationLng;

	public WeatherForecastRq(
			  @NotNull LocalDateTime originDateTime
			, @NotNull LocalDateTime destinationDateTime
			, @NotNull Double originLat
			, @NotNull Double originLng
			, @NotNull Double destinationLat
			, @NotNull Double destinationLng) 
	{
		super();
		this.originDateTime = originDateTime;
		this.destinationDateTime = destinationDateTime;
		this.originLat = originLat;
		this.originLng = originLng;
		this.destinationLat = destinationLat;
		this.destinationLng = destinationLng;
	}

	public LocalDateTime getOriginDateTime() {
		return originDateTime;
	}

	public void setOriginDateTime(LocalDateTime originDateTime) {
		this.originDateTime = originDateTime;
	}

	public LocalDateTime getDestinationDateTime() {
		return destinationDateTime;
	}

	public void setDestinationDateTime(LocalDateTime destinationDateTime) {
		this.destinationDateTime = destinationDateTime;
	}

	public Double getOriginLat() {
		return originLat;
	}

	public void setOriginLat(Double originLat) {
		this.originLat = originLat;
	}

	public Double getOriginLng() {
		return originLng;
	}

	public void setOriginLng(Double originLng) {
		this.originLng = originLng;
	}

	public Double getDestinationLat() {
		return destinationLat;
	}

	public void setDestinationLat(Double destinationLat) {
		this.destinationLat = destinationLat;
	}

	public Double getDestinationLng() {
		return destinationLng;
	}

	public void setDestinationLng(Double destinationLng) {
		this.destinationLng = destinationLng;
	}
}
