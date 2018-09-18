package EmpleadoTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Empleado.Empleado;
import Empleado.Gerente;

public class GerenteTest {

	@Test
	public void CrearEmpleadoTest() {
		Gerente gerente1= new Gerente("Turco", 2.0, new Date(4, 4, 1940), "Legales", 69);
		assertNotNull(gerente1);

	}

	@Test
	public void EsOnoEsEmpleadoTest() {
		String detalles;
		Gerente gerente1= new Gerente("Turco", 2.0, new Date(4, 4, 1940), "Legales", 69);
		detalles = gerente1.brindarDetalles();
		assertTrue(detalles.contains("gerente"));
	}

}
