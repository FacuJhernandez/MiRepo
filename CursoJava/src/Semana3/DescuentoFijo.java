package Semana3;

public class DescuentoFijo extends Descuento{

	
	
	public DescuentoFijo(Float valor){
		this.setValorDesc(valor);
	}
	
	
	
	
	@Override
	public float ValorFinal(float valorInicial) {
		
		return valorInicial - this.getValorDesc();
	}

}
