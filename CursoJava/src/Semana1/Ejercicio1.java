
package Semana1;

public class Ejercicio1 {

	
	
	public static void main(String[] args) {
		
		
	int numeroInicio= 5;
	int numeroFin=14;
	int numeroActual=numeroInicio;
	String mostrar="par";
		
	while (numeroActual<=numeroFin) {
			
		if(mostrar=="par") {
			if(numeroActual%2==0) {
				System.out.println(numeroActual);
			}
		} else if(mostrar=="impar") {
				if(numeroActual%2!=0) {
					System.out.println(numeroActual);
				}
				
		} else {
				
				System.out.println("Error, se debe de especificar si se quiere mostrar par o impar");
				numeroActual=numeroFin;
			}
				
			numeroActual++;
		} 	
		
	/*	
		for(int i =numeroFin;i>=numeroInicio;i--) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	*/	 
/*		
	int ingresosMensuales=12331;
	int vehiculosdquiridos=4;
	int antiguedadVehiculos=5;
	int cantMuebles=5;
	boolean PoseeEmbarcacion= false;
	boolean PoseeAeronave= false;
	boolean PoseeTituloActivos= false;
	
	if(ingresosMensuales>=489.083 && (vehiculosdquiridos>=3 && antiguedadVehiculos<=5) && cantMuebles>=3 && (PoseeEmbarcacion || PoseeAeronave || PoseeTituloActivos )) {
		System.out.println("Esta persona pertenece al segmento de ingresos altos");
	} else{
		System.out.println("Esta persona no pertenece al segmento de ingresos altos");
		
	}
	*/
	}
	
	
	
	
}


