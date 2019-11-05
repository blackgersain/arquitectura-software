package software.architecture.microservices.movilidad.directions.dto;

import java.io.Serializable;

import com.google.maps.model.DirectionsResult;

public class DirectionsGoogleRs implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -664699770455471861L;
	
	private DirectionsResult directionsResult;
	private String status;
	private String message;
	
	public DirectionsGoogleRs() {}
	
	public DirectionsGoogleRs(DirectionsResult directionsResult, String status, String message) {
		super();
		this.directionsResult = directionsResult;
		this.status = status;
		this.message = message;
	}

	public DirectionsResult getDirectionsResult() {
		return directionsResult;
	}

	public void setDirectionsResult(DirectionsResult directionsResult) {
		this.directionsResult = directionsResult;
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
