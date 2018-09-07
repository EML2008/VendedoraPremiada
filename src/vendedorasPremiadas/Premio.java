package vendedorasPremiadas;

public class Premio {
	private int numeroDeVendedora;
	private double montoGanador;
	private int secuenciaGanadora;
	private boolean empate = false;
	private boolean sinGanadora = false;

	public Premio(int nroVendedora, double monto, int secuencia, boolean empate, boolean sinGanadora) {
		this.numeroDeVendedora = nroVendedora;
		this.montoGanador = monto;
		this.secuenciaGanadora = secuencia;
		this.empate = empate;
		this.sinGanadora = sinGanadora;
	}

	@Override
	public String toString() {
		return "Premio: numeroDeVendedora = " + numeroDeVendedora + ", montoGanador = " + montoGanador
				+ ", secuenciaGanadora = " + secuenciaGanadora + ", empate = " + empate + ", sinGanadora = "
				+ sinGanadora + "]";
	}

}
