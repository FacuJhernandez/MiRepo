package Semana3y4;

public class descuentoPorcentaje extends Descuento{

	
	public descuentoPorcentaje(float valor) {
		this.setValorDesc(valor);
	}
	
	@Override
	public float ValorFinal(float valorInicial) throws AlAplicarDescuentoValorNegativo {
		float porcentaje = valorInicial * this.getValorDesc();
		porcentaje= porcentaje/100;
		
		if((valorInicial-porcentaje)<0) {
			
			throw new AlAplicarDescuentoValorNegativo(this); 
			
		}
		else {
			return valorInicial-porcentaje;
		}
		
	}

}
