package Empleado;

import java.util.Date;

public class Secretaria extends Empleado {

	public Secretaria(String nombre, Double salario, Date fechaDeNacimiento) {
		super(nombre, salario, fechaDeNacimiento);
	}

	public String brindarDetalles() {
		String detalles;
		detalles="Soy una secretaria. Nombre: " + nombre;
		return detalles;
	}
}
