package Empleado;

import java.util.Date;

public class Empleado {

	protected String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	protected Double salario;
	protected Date fechaDeNacimiento;

	public Empleado(String nombre, Double salario, Date fechaDeNacimiento) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Empleado(String nombre, Double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public String brindarDetalles() {
		String detalles;
		detalles="Soy un empleado. Nombre: " + nombre;
		return detalles;
	}

}
