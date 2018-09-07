package vendedorasPremiadas;

public class Vendedora {
	private double[] ventas;

	public Vendedora(double[] ventas) {
		this.ventas = ventas;
	}

	public double secuencia(int n) {
		double valorMax = 0;
		double valorActual = 0;
		if (n > this.ventas.length)
			return 0;
		for (int i = 0; i < this.ventas.length - n + 1; i++) {
			for (int j = 0; j < n; j++) {
				valorActual += ventas[i + j];
				if (valorActual > valorMax)
					valorMax = valorActual;
			}
			valorActual = 0;
		}
		return valorMax;
	}
}
