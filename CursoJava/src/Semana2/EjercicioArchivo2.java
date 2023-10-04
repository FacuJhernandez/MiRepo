package Semana2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class EjercicioArchivo2 {

	
	
	
	
	public static void main(String[] args) {
		//Ejercicio a
		/*
		String archivo= "C:\\Users\\Pais Gamer\\git\\CursoJavaa\\CursoJavaa\\src\\Semana2\\prueba.txt";
		List<String> numeros = null;
		try {
			
			numeros= Files.readAllLines(Paths.get(archivo));
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
		int sumatoria= 0;
		
		for(int i=0; i<numeros.size();i++) {
			sumatoria=sumatoria + Integer.parseInt(numeros.get(i));
			
			
		}
		
		System.out.println(sumatoria);
		
	*/	
		//Ejercicio b
	
	
		String archivo= "archivos\\prueba.txt";
		List<String> numeros = null;
		String operacion="sumar";
		try {
			
			numeros= Files.readAllLines(Paths.get(archivo));
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int resultado= 1;
		
		for(int i=0; i<numeros.size();i++) {
			if(operacion.equals("sumar")) {
				resultado=resultado + Integer.parseInt(numeros.get(i));
			}
			else if( operacion.equals("multiplicar")) {
				
			
				resultado = resultado * Integer.parseInt(numeros.get(i));
			}
			
			
		}
		
	
			System.out.println(resultado);
		
	}
}
