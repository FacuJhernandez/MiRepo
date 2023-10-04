package Semana2;

public class Ejercicio1String {

	public static void main(String[] args) {
		
		char letra='a';
		String palabra="abanana";
		int contador=0;
		
		for(int i =0; i<palabra.length();i++) {
			if(letra==palabra.charAt(i)) {
				contador++;
				
			}
		
		
		}
		System.out.println(contador);
		
		
	}
}
