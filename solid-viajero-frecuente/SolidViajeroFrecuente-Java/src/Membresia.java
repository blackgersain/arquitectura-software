import java.time.LocalDate;

public abstract class Membresia implements IAcumularMillasViaje {
	
	 private Pasajero pasajero;
	 private Integer acumulado;
	 private LocalDate fechaExpiracion;
	 
	public Pasajero getPasajero() {
		return pasajero;
	}
	
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public Integer getAcumulado() {
		return acumulado;
	}
	
	public void setAcumulado(Integer acumulado) {
		this.acumulado = acumulado;
	}
	
	public LocalDate getFechaExpiracion() {
		return fechaExpiracion;
	}
	
	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
}
