package ejercicio2;

public class runner {
public static void main(String[] args) {
	trabajador [] trabajadores= new trabajador[2];
	trabajadores[0] =new empleado("Dumar", 252564, "ingeniero", "sogamoso", 2321251, "12/02/2002", "12/05/2020", 2500000, 0.1);
	trabajadores[1]= new consultor("Jimena", 11561, "Doctora", "Sogamoso", 515615, "02/05/2002", "12/06/2020", 500000, 2.5);
	for (int i = 0; i < trabajadores.length; i++) {
		System.out.println(trabajadores[i].getNombre()+"\n"+trabajadores[i].calcularPaga()+"\n"+
	                       trabajadores[i].getCedula()+"\n"+ trabajadores[i].getDireccion()+"\n"+
	                       trabajadores[i].getPuesto()+"\n"+trabajadores[i].getFechanacimiento()+"\n");
		
	}
	/*trabajador empleado1= new empleado("Dumar", 56515, "ingeniero", "sogamosmo", 5165156, "08/02/20002", "12/05/2020", 2500000, 0.1);
	trabajador empleado2= new consultor("Laura", 51616, "abogada", "tunja", 561561, "08/05/2003", "05/02/2021", 250, 2.5);
	empleado1.showSer();
	empleado2.showSer();*/
}

}
