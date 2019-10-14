
public abstract class Beneficio {

	private Float costo;
	private String nombre;
	
	public Float getCosto() {
		return costo;
	}
	
	public void setCosto(Float costo) {
		this.costo = costo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract Beneficio redimir(Integer acumulado);
}
