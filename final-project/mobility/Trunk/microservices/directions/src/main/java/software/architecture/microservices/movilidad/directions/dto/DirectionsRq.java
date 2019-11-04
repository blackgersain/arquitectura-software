package software.architecture.microservices.movilidad.directions.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DirectionsRq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3247594733813913170L;
	
	@NotNull
	private Double originLat;

	@NotNull
	private Double originLng;
	
	@NotNull
	private Double destinationLat;
	
	@NotNull
	private Double destinationLng;
	
	public DirectionsRq(Double originLat, Double originLng, Double destinationLat, Double destinationLng) {
		super();
		this.originLat = originLat;
		this.originLng = originLng;
		this.destinationLat = destinationLat;
		this.destinationLng = destinationLng;
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
