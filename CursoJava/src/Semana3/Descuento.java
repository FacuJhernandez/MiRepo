package Semana3;

public abstract class Descuento {

	
	private float valor;
	
		
		
		
		
		
	public float getValorDesc() {
		return this.valor;
		
	}
	
	public void setValorDesc(float valor) {
		this.valor=valor;
		
	}
	
	public abstract float ValorFinal (float valorInicial);
		
	
	
}
