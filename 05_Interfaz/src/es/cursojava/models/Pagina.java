package es.cursojava.models;

import es.cursojava.interfaces.Imprimible;

public class Pagina implements Imprimible {

	private int nPagina;
	private int nLineas;
	
	
	public Pagina(int nPagina, int nLineas) {
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Tenemos " + nPagina + " páginas de " + nLineas + " líneas.");

	}

	@Override
	public void informeCorto() {
		System.out.println("Tenemos " + nPagina + " páginas.");

	}

}
