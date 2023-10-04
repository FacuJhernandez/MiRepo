package Semana2;

public class Ejercicio3Vectotes {

	public static void main(String[] args) {
		
		int [] numeros = new int [] {10,5,6,8,9}; 
		int sumatorio=0;
		int elegido=7;
		
		
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]>elegido) {
				
				sumatorio= sumatorio + numeros[i];
			}
			
		}
		
		System.out.println(sumatorio);
		
	}
	
	
}
