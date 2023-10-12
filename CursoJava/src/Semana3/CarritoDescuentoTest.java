package Semana3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



class CarritoDescuentoTest {

	
	public Carrito InicializarCarrito() {
		Producto p1= new Producto("CocaCola","1234",50);
		Producto p2= new Producto("Galletita","1111",30);
		Producto p3= new Producto("Gomitas","2222",20);
		
		return new Carrito(p1,p2,p3);
		
	}

	
	
	@Test
	void prueba1DescuentoFijo() {
		Carrito c =InicializarCarrito();
		DescuentoFijo d = new DescuentoFijo((float) 10);
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),90);
		
	}
	
	@Test
	void prueba2DescuentoFijo() {
		Carrito c =InicializarCarrito();
		DescuentoFijo d = new DescuentoFijo((float) (25-10));
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),85);
		
	}
	
	
	
	
	
	@Test
	void prueba1DescuentoPorcentaje() {
		Carrito c =InicializarCarrito();
		descuentoPorcentaje d = new descuentoPorcentaje((float) 10);
		
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),90);
		
	}
	
	@Test
	void prueba2DescuentoPorcentaje() {
		Carrito c =InicializarCarrito();
		descuentoPorcentaje d = new descuentoPorcentaje((float) 25);
		
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),75);
		
	}
	@Test
	void prueba1DescuentoPorcentajeConTopeDondeTopeNOseSobrepasa() {
		Carrito c =InicializarCarrito();
		DescuentoPorcentajeConTope d = new DescuentoPorcentajeConTope((float) 20, 40);
		
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),80);
		
	}
	
	@Test
	void prueba2DescuentoPorcentajeConTopeDondeTopeSIseSobrepasa() {
		Carrito c =InicializarCarrito();
		DescuentoPorcentajeConTope d = new DescuentoPorcentajeConTope(20,10);
		
		c.setDescuento(d);
		
		assertEquals(c.costoFinal(),90);
		
	}
	
	
	
}
