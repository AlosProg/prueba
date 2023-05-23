package es.cursojava.directora;

import es.cursojava.interfaces.Imprimible;
import es.cursojava.models.Factura;
import es.cursojava.models.Pagina;

public class GestionDeImpresion {

	public static void main(String[] args) {
		
		/*
		Pagina p1 = new Pagina(37,25);
		Factura f1 = new Factura(1221,990);
		
		p1.informeCorto();
		p1.informeLargo();
		
		f1.informeCorto();
		f1.informeLargo();
		*/
		
		Imprimible i1 = new Pagina(45,22);
		i1.informeCorto();
		i1.informeLargo();
		System.out.println("===========================================");
		
		Imprimible i2 = new Factura(1221,999);
		i2.informeCorto();
		i2.informeLargo();
		System.out.println("===========================================");
	}
}
