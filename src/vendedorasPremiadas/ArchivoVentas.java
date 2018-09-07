package vendedorasPremiadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoVentas {

	public static Supermercado leerArchivo(String path) throws FileNotFoundException {
		File archivo = new File(path);
		Scanner sc = new Scanner(archivo);
		int cantidadDeVentasVendedoraActual = 0;
		double[] valorVentasVendedora;
		Vendedora[] vendedoras = new Vendedora[sc.nextInt()];
		for (int i = 0; i < vendedoras.length; i++) {
			cantidadDeVentasVendedoraActual = sc.nextInt();
			valorVentasVendedora = new double[cantidadDeVentasVendedoraActual];
			for (int j = 0; j < cantidadDeVentasVendedoraActual; j++) {
				valorVentasVendedora[j] = sc.nextDouble();
			}
			vendedoras[i] = new Vendedora(valorVentasVendedora);
		}
		int cantidadDeVentaMinima = sc.nextInt();
		sc.close();
		return new Supermercado(cantidadDeVentaMinima, vendedoras);
	}

	public static void escribirArchivo(String path, Premio premio) throws FileNotFoundException {
		File archivo = new File(path);
		PrintWriter salida = new PrintWriter(archivo);
		if (premio.isEmpate())
			salida.println("No se puede desempatar");
		else if (premio.isSinGanadora())
			salida.println("No hay ganadoras");
		else {
			salida.println(premio.getNumeroDeVendedora());
			salida.print(premio.getSecuenciaGanadora() + " " + premio.getMontoGanador());
		}
		salida.close();
	}
}
