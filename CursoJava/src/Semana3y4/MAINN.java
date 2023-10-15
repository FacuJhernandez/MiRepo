package Semana3y4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MAINN {
 
	  

	
	public static void main(String[] args) {
		
		
		// este alooritmo se hizo asumiendo que los productos en el archivo estan en el siguente formato
		// 40,nombre,codigo, 
		
		String archivo= "archivos\\Productos.txt";
		List<String> productos = null;
		String codigoProducto="";
		String valorProducto="";
		String nombreProducto="";
		int contador=0;
		
		
		Carrito carrito= new Carrito();
		DescuentoFijo descuento= new DescuentoFijo((float) 10);
		carrito.setDescuento(descuento);
		
		try {
			productos= Files.readAllLines(Paths.get(archivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for (int i=0; i<productos.size();i++) {
			
			String linea=productos.get(i);
			
			for(int j=0;j<linea.length();j++) {
				
				if(linea.charAt(j)==',') {
					contador++;
				}

				
				if(contador==0) {
					valorProducto= valorProducto + linea.charAt(j);
				}
				if(contador==1) {
					nombreProducto= nombreProducto + linea.charAt(j);
				 }
				if(contador==2) {
					codigoProducto= codigoProducto + linea.charAt(j);
				}	
				if(contador==3) {
					
					Producto p = new Producto(nombreProducto,codigoProducto,Float.parseFloat(valorProducto));
					carrito.añadirProducto(p);
					 contador=0;
				}
					
			}
			
			codigoProducto="";
			valorProducto="";
			nombreProducto="";
		
		}
	
		;
		
	
		
		
		try {
			System.out.println(carrito.costoFinal());
		} catch (CarritoPrecio0Exception e) {
			System.out.println("El precio del carrito no puede ser 0");
		}
		
	}

	
	
	
	
	
	
	
	
}
