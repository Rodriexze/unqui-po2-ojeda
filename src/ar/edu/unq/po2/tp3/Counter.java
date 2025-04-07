package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros;

	public Counter() {
		this.numeros = new ArrayList<>();
	}

	public void addNumber(int numero) {
		numeros.add(numero);
	}

	public Boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public int cantidadDePares() {
		int count = 0;
		for (int numero : numeros) {
			if (esPar(numero)) {
				count++;
			}
		}
		return count;
	}

	public Boolean esImpar(int numero) {
		return numero % 2 != 0;
	}

	public int cantidadDeImpares(ArrayList<Integer> numeros) {
		int count = 0;
		for (int numero : numeros) {
			if (esImpar(numero)) {
				count++;
			}
		}
		return count;
	}

//Ej2
	
	public int cantidadNumDePares(int numero) { // no se si funciona como deberia
		int cantidadPares = 0;
		while (numero > 0) {
			cantidadPares += this.unoSi(esPar(numero));
			numero = numero % 10;
		}
		return cantidadPares;
	}

	public int unoSi(boolean condicion) {
		if (condicion) {
			return 1;
		}
		return 0;
	}

	public int mayorCantidadDePares() { // separar este lindo plato de spaggetti
		int numeroConMasParesVisto = 0;
		int mayorPares = 0;
		for (int numero : numeros) {
			if (cantidadNumDePares(numero) > mayorPares) {
				mayorPares = cantidadNumDePares(numero);
				numeroConMasParesVisto = numero;
			}
		}
		return numeroConMasParesVisto;
	}

	public int getEvenOcurrences() {
		return this.cantidadDePares();
	}

}
