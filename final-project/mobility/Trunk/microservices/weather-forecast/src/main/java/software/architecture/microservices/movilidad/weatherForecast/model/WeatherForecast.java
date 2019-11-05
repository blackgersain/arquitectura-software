package software.architecture.microservices.movilidad.weatherForecast.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeatherForecast {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private Double originLat;
	
	@Column
	private Double originLng;
	
	@Column
	private Double destinationLat;

	@Column
	private Double destinationLng;
	
	@Column
	private LocalDateTime dateTime;
	
	@Column 
	private LocalDateTime originDateTime;
	
	@Column
	private LocalDateTime destinationDateTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
