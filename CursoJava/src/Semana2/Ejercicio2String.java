package Semana2;

public class Ejercicio2String {

	public static void main(String[] args) {
		
		int numero1= 12;
		int numero2=32;
		int numero3= 45;
		String orden="desc";
		int [] numerosOrdenados= new int [3];
		
		if(orden.equals("asc")) {
			numerosOrdenados[0]=numero1;
			numerosOrdenados[1]=numero2;
			numerosOrdenados[2]=numero3;
			
		}
		else if(orden.equals("desc")) {
			numerosOrdenados[0]=numero3;
			numerosOrdenados[1]=numero2;
			numerosOrdenados[2]=numero1;
			
			
		}
		
		for(int i =0; i<numerosOrdenados.length;i++) {
			
			System.out.println(numerosOrdenados[i]);
			
		}
		
	
		
		
		
	}
}
