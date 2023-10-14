package Semana3;

import java.util.ArrayList;

public class Carrito {

	
	private ArrayList<Producto> productos;

	private Descuento descuento;
	
	
	
	public Carrito() {
		productos= new ArrayList<Producto>();
	
	}

	public float costoFinal() {
		float costoFinal=0;
		for(int i =0; i<this.productos.size();i++) {
			costoFinal= costoFinal + productos.get(i).costoFinal();
		}
		
		
		return descuento.ValorFinal(costoFinal);
		
	}


	public void setDescuento(Descuento d) {
		this.descuento=d;
	}

	public void añadirProducto (Producto p) {
		this.productos.add(p);
	}
	
}
