package Semana3y4;

import java.util.ArrayList;

public class Carrito {

	
	private ArrayList<Producto> productos;

	private Descuento descuento;
	
	
	
	public Carrito() {
		productos= new ArrayList<Producto>();
	
	}

	public float costoFinal() throws CarritoPrecio0Exception {
		float costoFinal=0;
		for(int i =0; i<this.productos.size();i++) {
			costoFinal= costoFinal + productos.get(i).costoFinal();
		}
		
		if(costoFinal==0) {
			throw new CarritoPrecio0Exception(this);
		}
		else {
		
				
				try {
					costoFinal= descuento.ValorFinal(costoFinal);
				} catch (AlAplicarDescuentoValorNegativo e) {
					System.out.println("no se puede aplica el descuento por que queda negativo");
					return -1;
				}
				
				

		}
		return costoFinal;
		
	}


	public void setDescuento(Descuento d) {
		this.descuento=d;
	}

	public void añadirProducto (Producto p) {
		this.productos.add(p);
	}
	
}
