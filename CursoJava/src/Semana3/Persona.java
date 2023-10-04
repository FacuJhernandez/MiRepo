package Semana3;

import java.time.LocalDateTime;

public class Persona {
	
	String nombre;
	String apellido;
	LocalDateTime fechaDeNacimiento;
	
	  
	
	public Persona (String n, String a, LocalDateTime nac) {
		this.nombre=n;
		this.apellido=a;
		this.fechaDeNacimiento=nac;
		
	}

	
	
	
	public static int edad() {
		return 20;
	}
}
