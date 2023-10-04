package Semana2;

import java.util.Scanner;

public class EjercicioArchivos1 {

	
	
	public static void main(String[] args) {
		
		/*
		String orden="desc";
		int valor1=2;
		int valor2=5;
		int valor3=7;
		int [] numeroOrdenados= new int  [3];
		
		if(orden.equals("asc")) {
			
			numeroOrdenados[0]=valor1;
			numeroOrdenados[1]=valor2;
			numeroOrdenados[2]=valor3;
			
		}
		else if(orden.equals("desc")) {
			numeroOrdenados[0]=valor3;
			numeroOrdenados[1]=valor2;
			numeroOrdenados[2]=valor1;
			
		}
		else {
			System.out.println("el orden esta mal dado es desc o asc");
			
		}
	
		for (int i=0; i<numeroOrdenados.length;i++) {
			System.out.println(numeroOrdenados[i]);
		}
	

		
		*/
		
		
		
		
		
		// ejercicio b//
		
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Ingrese un numero");
		int valor1= entrada.nextInt();
		System.out.println("Ingrese otro numero");
		int valor2= entrada.nextInt();
		System.out.println("Ingrese otro numero");
		int valor3= entrada.nextInt();
	
		System.out.println("ingrese el orden en la que quiere que se organice los numeros");
		String orden= entrada.next();
		
		int [] Ordenamiento= ordenar(valor1,valor2,valor3,orden);
		
		for (int i=0; i<Ordenamiento.length;i++) {
			System.out.println(Ordenamiento[i]);
		}
			
	}

	
	
	
	
	public static int [] ordenar (int valor1, int valor2, int valor3, String orden){
		
		
		int [] numeroOrdenados= new int [3];
		int mayor=0;
		int medio=0;
		int menor=0;
		if(valor1>valor2 && valor1 > valor3) {
			mayor=valor1;
			if(valor2>valor3) {
				medio=valor2;
				menor=valor3;
			} else {
				medio=valor3;
				menor=valor2;
			}
				
		}
		else if(valor2>valor1 && valor2>valor3) {
			mayor=valor2;
			if(valor1>valor3) {
				medio=valor1;
				menor=valor3;
			}
			else {
				medio=valor3;
				menor=valor1;
			}
			
		
		}
		else {
			
			mayor=valor3;
			if(valor2>valor1) {
				medio=valor2;
				menor=valor1;
			} else {
				medio=valor1;
				menor=valor2;
			}
	
		}
		
		if(orden.equals("asc")){
			numeroOrdenados[0]=menor;
			numeroOrdenados[1]=medio;
			numeroOrdenados[2]=mayor;
			
		}else {
			numeroOrdenados[2]=menor;
			numeroOrdenados[1]=medio;
			numeroOrdenados[0]=mayor;
			
		}
		
	
		
	
		return numeroOrdenados;
	}





}	
