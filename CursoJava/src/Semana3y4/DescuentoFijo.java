package Semana3y4;

public class DescuentoFijo extends Descuento{

	
	
	public DescuentoFijo(Float valor){
		this.setValorDesc(valor);
	}
	
	
	
	
	@Override
	public float ValorFinal(float valorInicial) throws AlAplicarDescuentoValorNegativo{
		if((valorInicial - this.getValorDesc())<0) {
			throw new AlAplicarDescuentoValorNegativo(this);
		}
		else{
			return valorInicial - this.getValorDesc();
		}
	}

}
