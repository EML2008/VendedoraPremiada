package vendedorasPremiadas;

import org.junit.Assert;
import org.junit.Test;


public class VendodoraTests {
	@Test
	public void pruebaConN2() {
		double [] ventas1 = new double[5];
		ventas1[0] = 4;
		ventas1[1] = 5;
		ventas1[2] = 10;
		ventas1[3] = 9;
		ventas1[4] = 4;
		Vendedora v1 = new Vendedora(ventas1);
		Assert.assertEquals(19,v1.secuencia(2),0.0);
	}

	@Test
	public void pruebaConNMayorAlMaximo() {
		double [] ventas1 = new double[5];
		ventas1[0] = 4;
		ventas1[1] = 5;
		ventas1[2] = 10;
		ventas1[3] = 9;
		ventas1[4] = 4;
		Vendedora v1 = new Vendedora(ventas1);
		Assert.assertEquals(-1,v1.secuencia(10),0.0);
	}
	
	@Test
	public void pruebaConNMaximo() {
		double [] ventas1 = new double[5];
		ventas1[0] = 4;
		ventas1[1] = 5;
		ventas1[2] = 10;
		ventas1[3] = 9;
		ventas1[4] = 4;
		Vendedora v1 = new Vendedora(ventas1);
		Assert.assertEquals(32,v1.secuencia(5),0.0);
	}
	
}
