package ejercicio2;

public class trabajador {
	private String nombre;
	private int cedula;
	private String puesto;
	private String direccion;
	private double telefono;
	private String fechanacimiento;
	private String fechacontratacion;
	
	
	

	public trabajador(String nombre, int cedula, String puesto, String direccion, double telefono,
			String fechanacimiento, String fechacontratacion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.fechacontratacion = fechacontratacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getTelefono() {
		return telefono;
	}
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getFechacontratacion() {
		return fechacontratacion;
	}
	public void setFechacontratacion(String fechacontratacion) {
		this.fechacontratacion = fechacontratacion;
	} 
	
	public void showSer() {
		System.out.println(getNombre()+getCedula()+getDireccion()+getFechacontratacion()+getFechanacimiento()+getPuesto()+getTelefono());
	}
	
	public double calcularPaga() {
		return 0.0;
	}
	
	
	
	

}
