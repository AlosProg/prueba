package es.cursojava.models;

import es.cursojava.interfaces.Imprimible;

public class Factura implements Imprimible {

	private int nFactura;
	private int codigoCliente;
	
	
	
	public Factura(int nFactura, int codigoCliente) {
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	@Override
	public void informeLargo() {
		System.out.println("Tenemos la factura número: " + nFactura + " del cliente " + codigoCliente + ".");

	}

	@Override
	public void informeCorto() {
		System.out.println("Tenemos la factura número: " + nFactura + ".");

	}

}
