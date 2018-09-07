package vendedorasPremiadas;

public class Supermercado {
	private Vendedora[] vendedoras;
	private Integer cantVentasMinimas;

	public Supermercado(Integer cantVentasMin, Vendedora[] vendedoras) {
		this.cantVentasMinimas = cantVentasMin;
		this.vendedoras = vendedoras;
	}

	public Premio premiar() {
		boolean hayGanadora = false;
		boolean noHayGanadora = false;
		boolean empate = false;
		boolean huboEmpate = false;
		double[] montosDeVendedoras = new double[this.vendedoras.length];
		double montoVendedoraGanadora = 0;
		int numeroVendedoraGanadora = 0;
		int contador = 0;

		while (!hayGanadora && !noHayGanadora && !empate) {
			for (int i = 0; i < this.vendedoras.length; i++) {
				montosDeVendedoras[i] = vendedoras[i].secuencia(cantVentasMinimas + contador);
			}

			if (Supermercado.hayEmpate(montosDeVendedoras)) {
				contador++;
				huboEmpate = true;
			} else if (Supermercado.hayGanadora(montosDeVendedoras)) {
				for (int j = 0; j < montosDeVendedoras.length; j++) {
					if (montoVendedoraGanadora < montosDeVendedoras[j]) {
						montoVendedoraGanadora = montosDeVendedoras[j];
						numeroVendedoraGanadora = j + 1;
					}
				}
				hayGanadora = true;
			} else if (huboEmpate)
				empate = true;
			else
				noHayGanadora = true;
		}
		return new Premio(numeroVendedoraGanadora,montoVendedoraGanadora,this.cantVentasMinimas + contador,empate,noHayGanadora);	
	}

	public static boolean hayEmpate(double[] montosVendedoras) {
		double valorActual = 0;
		double valorMaximo = 0;
		int contadorVecesMaximo = 0;

		for (int i = 0; i < montosVendedoras.length; i++) {
			valorActual = montosVendedoras[i];
			if (valorActual > valorMaximo && valorActual > 0) {
				valorMaximo = valorActual;
				contadorVecesMaximo = 0;
			} else if (valorActual == valorMaximo && valorActual > 0)
				contadorVecesMaximo++;
		}
		return contadorVecesMaximo >= 1;
	}

	public static boolean hayGanadora(double[] montosVendedoras) {
		double valorActual = 0;
		double valorMaximo = 0;

		for (int i = 0; i < montosVendedoras.length; i++) {
			valorActual = montosVendedoras[i];
			if (valorActual > valorMaximo && valorActual > 0) {
				valorMaximo = valorActual;
			}
		}
		return valorMaximo != 0;
	}

}
