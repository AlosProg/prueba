# INTERFACES
![Ejemplo de Interfaz en Java](https://lh3.googleusercontent.com/yxYeve1dY0y6NMGQ_lHx_m2eRgFu5G8GB91L1LPWD_ivSMiQXk0aun0Df-ujGt-0oNNowT5R0xkbn1oSUY9Kz71MtCaagm79eugXcuqw2ZjTejUg4hsKsarRBKzjiK73yFLGJwwTiB5eymqWGAqhv_JZpNxduzJulhQ3P6CJij8Q9LGOagDArWdw1opsL_C1SE_oUpAksO0HTjvxhhOyk_DSUN68UsiLzhrBTKCe-VvCKcJjMzc8miqkSsch6pj8YGJXfKdsm9BQbyfMPDCmpvHg1BsnAzcJvpmB8Sc_gTDUHXe3e0L4QBNYK30OoBaV03E3hiYSIuXAPxGHu5Q9h_f2Rqh-8IOyMrIHxUOKOJIUp-GukeMQcJZfBWc6WWEtICGgsV4F3vFdZKj_QRt-geO1xmIOHy8VuhbLbOR57H-qm4NoC57a8skI1jzvyhG2mVtr7Dd1EEZRKJGNenKj4r_KXwAf5fnJ1bnr1BXO7Mt-FW0Orr5ypZ-IlfHKrD_vNg9uuDxF4c9Ok8jYn9-tBjzmXJ80mfhU_qCUrC-ktKEPRbPlA3joaWJ2cHxh4Un6ewZP6ljGPlhUvg2gjr8Amb1luHXpmIF411fxRo8IRakCkzgEKl2s=w515-h406-no)
## **Índice**

#### **Models (paquete)**
##### - Factura (clase)
##### - Pagina (clase)
#### **Intefaces (paquete)**
##### - Imprimible (interfaz)
#### **Directora (paquete)**
##### - GestionDeImpresion (clase Main)

## **Descripción del proyecto**
El proyecto es creado para ver cómo funcionan las interfaces en Java. 

## **Estado del proyecto**
:octocat:Terminado :octocat:

## **Demostración de funciones y aplicaciones**
public class GestionDeImpresion {

	public static void main(String[] args) {
  
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

En la clase Main creamos dos instancias de, una de una página y otra de una factura, se obtienen los siguientes resultados:

- Tenemos 45 páginas.
- Tenemos 45 páginas de 22 líneas

- Tenemos la factura número: 1221.
- Tenemos la factura numero: 1221 del cliente 999

