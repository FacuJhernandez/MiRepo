package Semana3y4;

public class AlAplicarDescuentoValorNegativo extends Exception{

	Descuento descuento;
	
	public AlAplicarDescuentoValorNegativo(Descuento d) {
		this.descuento=d;
	}
}
