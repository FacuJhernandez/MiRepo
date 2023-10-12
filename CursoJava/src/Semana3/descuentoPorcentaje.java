package Semana3;

public class descuentoPorcentaje extends Descuento{

	
	public descuentoPorcentaje(float valor) {
		this.setValorDesc(valor);
	}
	
	@Override
	public float ValorFinal(float valorInicial) {
		float porcentaje = valorInicial * this.getValorDesc();
		porcentaje= porcentaje/100;
		
		return valorInicial-porcentaje;
			
	}

}
