import java.util.ArrayList;
import java.util.List;

public class CalculadorBeneficio {

	public  List<Beneficio> calcular(Membresia membresia, List<Beneficio> beneficios) {
		//TODO: lógica para cálculo de beneficios
		
		List<Beneficio> beneficiosRedimidos = new ArrayList<Beneficio>();
		for (Beneficio beneficio : beneficios) {
			Beneficio beneficioRedimido = beneficio.redimir(membresia.getAcumulado());
			beneficiosRedimidos.add(beneficioRedimido);
		}
		return beneficiosRedimidos;
	}
}
