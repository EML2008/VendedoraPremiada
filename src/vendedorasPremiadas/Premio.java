package vendedorasPremiadas;

public class Premio {
	private int numeroDeVendedora;
	private double montoGanador;
	private int secuenciaGanadora;
	private boolean empate = false;
	private boolean sinGanadora = false;

	public int getNumeroDeVendedora() {
		return numeroDeVendedora;
	}

	public double getMontoGanador() {
		return montoGanador;
	}

	public int getSecuenciaGanadora() {
		return secuenciaGanadora;
	}

	public boolean isEmpate() {
		return empate;
	}

	public boolean isSinGanadora() {
		return sinGanadora;
	}

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
