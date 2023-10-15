package Semana3y4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



class CarritoDescuentoTest {

	
	public Carrito InicializarCarrito() {
		Producto p1= new Producto("CocaCola","1234",50);
		Producto p2= new Producto("Galletita","1111",30);
		Producto p3= new Producto("Gomitas","2222",20);
		
		Carrito c = new Carrito();
		c.añadirProducto(p1);
		c.añadirProducto(p2);
		c.añadirProducto(p3);
		return c;
	}

	
	
	@Test
	void prueba1DescuentoFijo() {
		Carrito c =InicializarCarrito();
		DescuentoFijo d = new DescuentoFijo((float) 10);
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),90);
		} catch (CarritoPrecio0Exception e) { 
			e.printStackTrace();
		}
		
	}
	
	@Test
	void prueba2DescuentoFijo() {
		Carrito c =InicializarCarrito();
		DescuentoFijo d = new DescuentoFijo((float) (25-10));
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),85);
		} catch (CarritoPrecio0Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@Test
	void prueba1DescuentoPorcentaje() {
		Carrito c =InicializarCarrito();
		descuentoPorcentaje d = new descuentoPorcentaje((float) 10);
		
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),90);
		} catch (CarritoPrecio0Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	void prueba2DescuentoPorcentaje() {
		Carrito c =InicializarCarrito();
		descuentoPorcentaje d = new descuentoPorcentaje((float) 25);
		
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),75);
		} catch (CarritoPrecio0Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void prueba1DescuentoPorcentajeConTopeDondeTopeNOseSobrepasa() {
		Carrito c =InicializarCarrito();
		DescuentoPorcentajeConTope d = new DescuentoPorcentajeConTope((float) 20, 40);
		
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),80);
		} catch (CarritoPrecio0Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	void prueba2DescuentoPorcentajeConTopeDondeTopeSIseSobrepasa() {
		Carrito c =InicializarCarrito();
		DescuentoPorcentajeConTope d = new DescuentoPorcentajeConTope(20,10);
		
		c.setDescuento(d);
		
		try {
			assertEquals(c.costoFinal(),90);
		} catch (CarritoPrecio0Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	void pruebaExceptionDeCarrito() {
		Carrito c= new Carrito();
		Producto p = new Producto("lapiz","1234",0);
		c.añadirProducto(p);
		
		try {
			System.out.println(c.costoFinal());
		} catch (CarritoPrecio0Exception e) {
			System.out.println("El precio del carrito no puede ser 0");
			
		}
		
		
	}	
	
	@Test
	void pruebaExceptionDeDescuento() {
		Carrito c =InicializarCarrito();
		DescuentoFijo d = new DescuentoFijo((float) (120));
		c.setDescuento(d);
		
		try {
				System.out.println(c.costoFinal());
		} catch (CarritoPrecio0Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
