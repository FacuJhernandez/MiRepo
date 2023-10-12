package Semana3;

public class DescuentoPorcentajeConTope extends descuentoPorcentaje {

		private float tope;
		
		
		
		public DescuentoPorcentajeConTope(float valor,float tope) {
			super(valor);
			this.tope=tope;
		}
		
		public float ValorFinal(float valorInicial) {
		
			float porcentaje= valorInicial* this.getValorDesc();
			porcentaje= porcentaje/100;

			if(porcentaje>this.tope) {
				
				return valorInicial-this.tope;
			}
		
			else {
				return super.ValorFinal(valorInicial);
			}
			
		}
}
