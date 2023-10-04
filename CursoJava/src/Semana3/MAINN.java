package Semana3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MAINN {
 
	  

	
	public static void main(String[] args) {
		
		
		// este alooritmo se hizo asumiendo que los productos en el archivo estan en el siguente formato
		// 40,nombre,codigo, y que son solo 3 productos 
		
		String archivo= "archivos\\Productos.txt";
		List<String> productos = null;
		String codigoProducto="";
		String valorProducto="";
		String nombreProducto="";
		int contador=0;
		int productoCreados=0;
		Producto p1 = null;
		Producto p2 = null;
		Producto p3 = null;
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
					if(productoCreados==0) {
					 	System.out.println(valorProducto);
					 	p1= new Producto(nombreProducto,codigoProducto,Float.parseFloat(valorProducto));	
					 }
					if(productoCreados==1) {
						System.out.println(valorProducto);
					 	p2= new Producto(nombreProducto,codigoProducto,Float.parseFloat(valorProducto));				
					 }				
					if (productoCreados==2) {
					 	System.out.println(valorProducto);
					 	p3= new Producto(nombreProducto,codigoProducto,Float.parseFloat(valorProducto));
					 }
					
					contador=0;
					productoCreados++;
				}
					
			}
			
			codigoProducto="";
			valorProducto="";
			nombreProducto="";
		
		}
	
		System.out.println(p1.costoFinal() + " " +p2.costoFinal() + " " +p3.costoFinal());
		
		Carrito carrito= new Carrito(p1,p2,p3);
		
		System.out.println(carrito.costoFinal());
		
	}

	
	
	
	
	
	
	
	
	
}
