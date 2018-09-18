package Empleado;

import java.util.Date;

public class Director extends Gerente {

	protected Double salarioExtra;

	public Double getSalarioExtra() {
		return salarioExtra;
	}

	public void setSalarioExtra(Double salarioExtra) {
		this.salarioExtra = salarioExtra;
	}

	public Director(String nombre, Double salario, Date fechaDeNacimiento, String departamento, Integer cochera,
			Double salarioExtra) {
		super(nombre, salario, fechaDeNacimiento, departamento, cochera);
		salarioExtra = this.salarioExtra;
	}

	public String brindarDetalles() {
		String detalles;
		detalles = "Soy un director. Nombre: " + nombre;
		return detalles;
	}
}
