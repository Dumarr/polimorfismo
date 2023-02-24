package ejercicio2;

public class empleado extends trabajador {
	private double sueldo, impuesto;

	
	
	public empleado(String nombre, int cedula, String puesto, String direccion, double telefono, String fechanacimiento,
			String fechacontratacion, double sueldo, double impuesto) {
		super(nombre, cedula, puesto, direccion, telefono, fechanacimiento, fechacontratacion);
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}

	public double calcularPaga() {
		return sueldo-impuesto;
	}
	
	public void showSer() {
		System.out.println("Nombre: "+getNombre()+"\nCedula: "+getCedula()+"\nDireccion: "+getDireccion()
							+"\nFecha de contratacion: "+getFechacontratacion()+"\nfecha nacimiento: "+getFechanacimiento()
							+"\npuesto: "+getPuesto()+"\ntelefono: "+getTelefono()+"\n");
	}

	
	
	

}
