package EmpleadoTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.hamcrest.Description;
import org.junit.Test;

import Empleado.Empleado;

public class EmpleadoTest {

	@Test
	public void CrearEmpleadoTest() {
		Empleado empleado1 = new Empleado("Turco", 2.0, new Date(4, 4, 1940));
		assertNotNull(empleado1);

	}

	@Test
	public void EsOnoEsEmpleadoTest() {
		String detalles;
		Empleado empleado1 = new Empleado("Turco", 2.0, new Date(4, 4, 1940));
		detalles = empleado1.brindarDetalles();
		assertTrue(detalles.contains("empleado"));
	}
}
