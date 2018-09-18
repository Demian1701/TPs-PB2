package Empleado;

import java.util.Date;

public class Gerente extends Empleado {

	protected String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	protected Integer cochera;

	public Gerente(String nombre, Double salario, Date fechaDeNacimiento, String departamento, Integer cochera) {
		super(nombre, salario, fechaDeNacimiento);
		departamento = this.departamento;
		cochera = this.cochera;
	}

	public String brindarDetalles() {
		String detalles;
		detalles = "Soy un gerente. Nombre: " + nombre;
		return detalles;
	}
}
