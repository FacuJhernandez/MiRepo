package Semana2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import java.nio.file.Paths;

public class EjercicioArchivo3 {

	
	public static void main(String[] args) throws IOException {
		
		
		String entrada="archivos\\entrada.txt"; 
		String salida="archivos\\salida.txt";
		String palabra="";
		FileWriter archivoSalida=null;
		PrintWriter escritor=null;
		
		try {
			
			for (String linea: Files.readAllLines(Paths.get(entrada))){
				palabra= palabra + linea;
				
			}
				
			
			
		} catch (IOException e) {
			System.out.println("Error en el programa");
			e.printStackTrace();
		}
		
		String palabraDecodificada=EjercicioAbecedario.decodificar(palabra, 1);
		
		
			
			try {
				archivoSalida = new FileWriter(salida);
				escritor= new PrintWriter(archivoSalida);
				
				escritor.println(palabraDecodificada);
				
				
			} catch (IOException e) {
				System.out.println("Error en el programa");
				e.printStackTrace();
			} finally {
				archivoSalida.close();
			}
			
			System.out.println("Termino el programa");
			

		
		
		

		
		
		
	 }
		
		
}
	
	
	


