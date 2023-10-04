package Semana2;

public class EjercicioAbecedario {

	
	
	public static void main(String[] args) {
		
		
		String palabra="hola que tal”";
		
		System.out.println(decodificar(palabra,2));
		

		
		
		
		
		
		
	}



	public static  String decodificar(String palabra, int salto) {
		String abecedario="abcdefghijklmnñopqrstuvwxyz ";
		String nuevaPalabra="";
		
		for (int i =0;i<palabra.length();i++) {
			for(int j=0; j<abecedario.length() ;j++) {
					if(abecedario.charAt(j)==palabra.charAt(i)) {
							if(j==27) {
								nuevaPalabra= nuevaPalabra + abecedario.charAt(salto-1);
							} else {
								
								nuevaPalabra= nuevaPalabra + abecedario.charAt(j+salto);
							}
						}
							
				}
						
		}
				
			return nuevaPalabra;
		
		
		
		
	}




}
