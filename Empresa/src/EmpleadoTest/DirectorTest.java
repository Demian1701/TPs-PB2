package EmpleadoTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Empleado.Director;

public class DirectorTest {

	@Test
	public void CrearEmpleadoTest() {
		Director director1 = new Director("Turco", 2.0, new Date(4, 4, 1940), "Legales", 69, 3.0);
		assertNotNull(director1);

	}

	@Test
	public void EsOnoEsEmpleadoTest() {
		String detalles;
		Director director1 = new Director("Turco", 2.0, new Date(4, 4, 1940), "Legales", 69, 3.0);
		detalles = director1.brindarDetalles();
		assertTrue(detalles.contains("director"));
	}

}
