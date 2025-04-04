package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public abstract class Counter {
	
	private ArrayList <Integer> numeros;

	public Counter() {
		this.numeros = new ArrayList<>();
	}
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	public Boolean esPar(int numero) {
		return numero % 2 == 0 ;
	}
	
	public int cantidadDePares(ArrayList <Integer> numeros) {
		int count = 0 ;
		for (int numero: numeros) {
			if (esPar(numero)) {
				count = + 1;
			}
		}
		return count ;
	}
	
	public Boolean esImpar(int numero) {
		return numero % 2 != 0 ;
	}
	
	public int cantidadDeImpares(ArrayList <Integer> numeros) {
		int count = 0 ;
		for (int numero: numeros) {
			if (esImpar(numero)) {
				count = + 1;
		}
		return count ;
	}
	
	
}
