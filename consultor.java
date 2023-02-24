package ejercicio2;

public class consultor extends trabajador {
	private int horas;
	private double tarifa;
	
public consultor(String nombre, int cedula, String puesto, String direccion, double telefono,
			String fechanacimiento, String fechacontratacion, int horas, double tarifa) {
		super(nombre, cedula, puesto, direccion, telefono, fechanacimiento, fechacontratacion);
		this.horas = horas;
		this.tarifa = tarifa;
	}

public double calcularPaga() {
	return horas*tarifa;
}



}
