package Semana3;



public class Carrito {

	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;

	private Descuento descuento;
	
	
	
	public Carrito(Producto p1, Producto p2, Producto p3) {
		this.producto1=p1;
		this.producto2=p2;
		this.producto3=p3;
	
	}

	public float costoFinal() {
		float costoFinal= this.producto1.costoFinal() + this.producto2.costoFinal() + this.producto3.costoFinal();
		
		return descuento.ValorFinal(costoFinal);
		
	}


	public void setDescuento(Descuento d) {
		this.descuento=d;
	}

}
