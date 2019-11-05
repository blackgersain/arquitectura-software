package software.architecture.microservices.movilidad.weatherForecast.dto;

import java.time.LocalDateTime;

public class WeatherForecastRs {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3247594733813913170L;
	
	private Double originLat;
	private Double originLng;
	private Double destinationLat;
	private Double destinationLng;
	private LocalDateTime dateTime; 
	private LocalDateTime originDateTime;
	private LocalDateTime destinationDateTime;

	public WeatherForecastRs(
			  Double originLat
			, Double originLng
			, Double destinationLat
			, Double destinationLng
			, LocalDateTime dateTime
			, LocalDateTime originDateTime
			, LocalDateTime destinationDateTime) 
	{
		super();
		this.originLat = originLat;
		this.originLng = originLng;
		this.destinationLat = destinationLat;
		this.destinationLng = destinationLng;
		this.dateTime = dateTime;
		this.originDateTime = originDateTime;
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

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
}
