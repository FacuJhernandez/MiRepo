package Semana3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculadoraTest {


	
	@Test
	void  Prueba1() {
		
		double nuimero1=80;
		double numero2=3;
		assertEquals(Calculadora.multiplicar(nuimero1, numero2), 240);
	}



	@Test
	void Prueba2() {
		
		
		double numero1=150;
		double numero2=180;
		double numero3=3;
		
		assertEquals(Calculadora.dividir(Calculadora.sumar(numero1, numero2), numero3),110);
	
	
	}
	
	@Test
	void Prueba3() {
		
		

		assertNotEquals(Calculadora.multiplicar(Calculadora.restar(90, 50), 15),605);
		
	}


	@Test
	
	void Prueba4() {
		
		
		assertNotEquals(Calculadora.multiplicar(Calculadora.sumar(70, 40), 25),2700);
		
	}
	
}
