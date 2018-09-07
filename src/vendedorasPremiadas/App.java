package vendedorasPremiadas;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		try {
			Supermercado supermercado = ArchivoVentas.leerArchivo("resource\\entrada\\enunciado.in");
			Premio premio = supermercado.premiar();
			ArchivoVentas.escribirArchivo("resource\\salida\\enunciado.out", premio);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
