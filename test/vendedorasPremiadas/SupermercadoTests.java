package vendedorasPremiadas;

import org.junit.Test;

public class SupermercadoTests {
	@Test
	public void pruebaCorrectoFuncionamiento() {
		double [] ventas1 = new double[4];
		double [] ventas2 = new double[3];
		double [] ventas3 = new double[3];
		
		ventas1[0] = 4;
		ventas1[1] = 5;
		ventas1[2] = 39;
		ventas1[3] = 1;
		
		ventas2[0] = 4;
		ventas2[1] = 35;
		ventas2[2] = 10;
		
		ventas3[0] = 40;
		ventas3[1] = 5;
		ventas3[2] = 10;
		
		Vendedora [] vendedoras = new Vendedora[3];
		vendedoras[0] = new Vendedora(ventas1);
		vendedoras[1] = new Vendedora(ventas2);
		vendedoras[2] = new Vendedora(ventas3);
		
		Supermercado supermercado = new Supermercado(5,vendedoras);
		System.out.println(supermercado.premiar().toString());
	}
}
