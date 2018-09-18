package EmpleadoTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Empleado.Empleado;
import Empleado.Secretaria;

public class SecretariaTest {

	@Test
	public void CrearEmpleadoTest() {
		Secretaria secretaria1 = new Secretaria("Turca", 2.0, new Date(4, 4, 1940));
		assertNotNull(secretaria1);

	}

	@Test
	public void EsOnoEsEmpleadoTest() {
		String detalles;
		Secretaria secretaria1 = new Secretaria("Turca", 2.0, new Date(4, 4, 1940));
		detalles = secretaria1.brindarDetalles();
		assertTrue(detalles.contains("secretaria"));
	}

}
